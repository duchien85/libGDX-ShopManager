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
        updateSize();
    }

    public static Event getNext() {
        updateSize();
        if (index <= size - 1)
            return events.get(index++);
        else
            return null;
    }

    private static void updateSize() {
        size = events.size();
    }
}
