package com.gpteam.shopmanager.Logger;

import java.util.ArrayList;

/*
 * Created by masmix on 14.02.2017.
 */
public final class Logger {
    // One universal way of sending and receiving packed strings
    // =========================================================
    // Both sending and receiving of packed strings that contain
    // messages important for the logger should be handled with
    // regular arrays.

//    private static ArrayList<String> messages = new ArrayList<String>();
//    private static String message;
    private static ArrayList<Log> logs = new ArrayList<Log>();

    public void receiveLog(Log log) {
    }
}