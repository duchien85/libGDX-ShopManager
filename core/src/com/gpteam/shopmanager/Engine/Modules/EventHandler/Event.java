package com.gpteam.shopmanager.Engine.Modules.EventHandler;

/*
 * Created by masmix on 13.05.2017.
 */
public class Event {
    private String[] text;

    public Event(String className, String text) {
        this.text = new String[2];
        this.text[0] = className;
        this.text[1] = text;
    }
    
    public String getClassName() {
        return text[0];
    }

    public String getText() {
        return text[1];
    }
}
