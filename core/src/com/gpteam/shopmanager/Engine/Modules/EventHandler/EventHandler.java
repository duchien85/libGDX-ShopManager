package com.gpteam.shopmanager.Engine.Modules.EventHandler;

import com.gpteam.shopmanager.Engine.Interfaces.Module;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 13.05.2017.
 */
public class EventHandler implements Module {
    private EventHandler instance = null;
    private EventHandler() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    public EventHandler getInstance() {
        if (instance == null)
            instance = new EventHandler();
        return instance;
    }

    private ArrayList<Event> events = new ArrayList<Event>();
    private int size;
    private int index = 0;

    public void add(Event event) {
        events.add(event);
        updateSize();
    }

    public Event getNext() {
        updateSize();
        if (index <= size - 1)
            return events.get(index++);
        else
            return null;
    }

    private void updateSize() {
        size = events.size();
    }
}
