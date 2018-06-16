package com.gpteam.shopmanager.game.engine.modules.event_handler;

import com.gpteam.shopmanager.game.engine.interfaces.Module;
import com.gpteam.shopmanager.game.engine.modules.error_handler.ErrorHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 13.05.2017.
 */
public class EventHandler implements Module {
    private EventHandler instance = null;
    private ArrayList<Event> events = new ArrayList<Event>();
    private int size;
    private int index = 0;

    private EventHandler() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    public EventHandler getInstance() {
        if (instance == null)
            instance = new EventHandler();
        return instance;
    }

    public void add(Event event) {
        events.add(event);
        updateSize();
    }

    // TODO the UI class that will use this class to get the event info in order to display it, should be designed to be a tool, there shouldn't be much stuff you have to do with it
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
