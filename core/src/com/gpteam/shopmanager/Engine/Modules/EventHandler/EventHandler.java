package com.gpteam.shopmanager.Engine.Modules.EventHandler;

import com.gpteam.shopmanager.Engine.Interfaces.Module;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 13.05.2017.
 */
public final class EventHandler implements Module {
    private EventHandler() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    private static ArrayList<Event> events = new ArrayList<Event>();
    private static int size;
    private static int index = 0;
    private static int id = 0;

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
