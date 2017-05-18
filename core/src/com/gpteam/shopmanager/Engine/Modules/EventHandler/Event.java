package com.gpteam.shopmanager.Engine.Modules.EventHandler;

/*
 * Created by masmix on 13.05.2017.
 */
public class Event {
    private String[] text;

    public Event(String class, String text) {
        this.text = new String[2];
        this.text[0] = class;
        this.text[1] = text;
    }
    
    public String getClass() {
        return text[0];
    }

    public String getText() {
        return text[1];
    }
}
