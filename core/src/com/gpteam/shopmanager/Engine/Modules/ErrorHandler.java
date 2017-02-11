package com.gpteam.shopmanager.Engine.Modules;

/*
 * Created by masmix on 11.02.2017.
 */
public class ErrorHandler {
    public static void handleIllegalArgumentException(String message) {
        throw new IllegalArgumentException(message);
    }

    public static void handleNoSuchMethodException(String message) {
        try { throw new NoSuchMethodException(message);
        } catch (NoSuchMethodException e) { e.printStackTrace(); }
    }
}
