package com.gpteam.shopmanager.Engine.Modules.EventHandler;

import java.util.ArrayList;
import java.util.TreeSet;

/*
 * Created by masmix on 13.05.2017.
 */
public final  class EventHandler {
    private static ArrayList<Event> events = new ArrayList<Event>();
    private static int size;
    private static int index = 0;

    public static void add(Event event) {
        events.add(event);
    }

    public static Event getNext() {
        updateSize();
        return events.get(index++);
    }

    private static void updateSize() {
        size = events.size();
    }
}
