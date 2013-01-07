package com.cl9p.applications.util;

import com.cl9p.applications.model.Pet;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import org.apache.log4j.Logger;

/**
 * @author: Lee Faus
 * Create Date: 12/27/12
 * @version: 1.0
 * @TODO Add Java Doc Information
 */
public class PetEntryListener implements EntryListener {
    Logger logger = Logger.getLogger(PetEntryListener.class);

    public void entryAdded(EntryEvent entryEvent) {
       logger.info(entryEvent.getEventType().name() + " == " + ((Pet)entryEvent.getValue()).getName() + " == CATEGORY == " + ((Pet)entryEvent.getValue()).getCategory().getName());
    }

    public void entryRemoved(EntryEvent entryEvent) {
        logger.info(entryEvent.getEventType().name() + " == " + ((Pet)entryEvent.getValue()).getName() + " == CATEGORY == " + ((Pet)entryEvent.getValue()).getCategory().getName());
    }

    public void entryUpdated(EntryEvent entryEvent) {
        logger.info(entryEvent.getEventType().name() + " == " + ((Pet)entryEvent.getValue()).getName() + " == CATEGORY == " + ((Pet)entryEvent.getValue()).getCategory().getName());
    }

    public void entryEvicted(EntryEvent entryEvent) {
        logger.info(entryEvent.getEventType().name() + " == " + ((Pet)entryEvent.getValue()).getName() + " == CATEGORY == " + ((Pet)entryEvent.getValue()).getCategory().getName());
    }
}
