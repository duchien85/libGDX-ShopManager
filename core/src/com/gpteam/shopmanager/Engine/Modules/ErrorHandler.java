package com.gpteam.shopmanager.Engine.Modules;

/*
 * Created by masmix on 11.02.2017.
 */
public class ErrorHandler {
    public void handleIllegalArgumentException(String message) {
        throw new IllegalArgumentException(message);
    }
}
