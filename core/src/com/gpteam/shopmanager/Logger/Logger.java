package com.gpteam.shopmanager.Logger;

import java.util.ArrayList;

/*
 * Created by masmix on 14.02.2017.
 */
public final class Logger {
    // One universal way of sending and receiving packed strings
    // =========================================================
    // Both sending and receiving of packed strings that contain
    // messages important for the logger must be handled
    // with regular arrays.
    
    private Logger() {
    ErrorHandler.handleUnsupportedOperationException("msg");
    }

    private static ArrayList<Log> logs = new ArrayList<Log>();
    private static int index = 0;
    private static int length = 0;

    public static void receiveLog(Log log) {
        length++;
        logs.add(log);
    }

    public static Log getNextLog() {
        if (index < length)
            return logs.get(index++);
        else {
            index = 0;
            return null;
        }
    }

    public ArrayList<Log> getAllLogs() {
        return logs;
    }
}