package com.gpteam.shopmanager.engine.modules.EventHandler;

import com.gpteam.shopmanager.engine.interfaces.Module;
import com.gpteam.shopmanager.engine.modules.ErrorHandler.ErrorHandler;

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

    private ArrayList<com.gpteam.shopmanager.engine.modules.EventHandler.Event> events = new ArrayList<com.gpteam.shopmanager.engine.modules.EventHandler.Event>();
    private int size;
    private int index = 0;

    public void add(com.gpteam.shopmanager.engine.modules.EventHandler.Event event) {
        events.add(event);
        updateSize();
    }

    public com.gpteam.shopmanager.engine.modules.EventHandler.Event getNext() {
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
