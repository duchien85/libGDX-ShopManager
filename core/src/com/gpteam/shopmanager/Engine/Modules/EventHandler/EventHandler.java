package com.gpteam.shopmanager.Engine.Modules.EventHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 13.05.2017.
 */
public final  class EventHandler {
    private static ArrayList<Event> events = new ArrayList<Event>();

    public static void add(Event event) {
        events.add(event);
    }
}
