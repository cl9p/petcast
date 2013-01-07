package com.cl9p.applications.testing;

import com.cl9p.applications.model.Category;
import com.cl9p.applications.model.Pet;
import com.hazelcast.client.HazelcastClient;
import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 * @author: Lee Faus
 * Create Date: 12/26/12
 * @version: 1.0
 * @TODO Add Java Doc Information
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-application-context.xml"})
public class HazelcastPetClientTest {
    static Logger logger = Logger.getLogger(HazelcastPetClientTest.class);

    @Autowired
    public HazelcastClient petClient;

    @BeforeClass
    public static void initialize_database() {
        logger.info("initializing the database ...");
    }

    @Test
    public void put_pet_into_hazelcast() {
        logger.info("putting pet into hazelcast ...");
        Map<String, Pet> mapPets = petClient.getMap("pets");
        mapPets.put("1", new Pet("1", "Aussidoodle", "Dakota", new Date(), Double.parseDouble("1300.00"), new Category("1", "Dog", "Dog Category")));
        Assert.assertTrue(true);
    }

    @Test
    public void get_num_pets() {
        logger.info("getting pets ...");
        Map<String, Pet> mapPets = petClient.getMap("pets");
        Collection<Pet> pets = mapPets.values();
        Assert.assertEquals(1, pets.size());
        for (Pet pet : pets) {
           logger.info(pet.getName() + " " + pet.getDescription() + " == Category == " + pet.getCategory().getName());
        }
    }

}
