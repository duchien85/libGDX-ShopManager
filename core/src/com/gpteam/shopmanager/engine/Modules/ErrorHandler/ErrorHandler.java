package com.gpteam.shopmanager.engine.Modules.ErrorHandler;

import com.gpteam.shopmanager.engine.Interfaces.Module;

/*
 * Created by masmix on 11.02.2017.
 */
public class ErrorHandler implements Module {
    private static ErrorHandler instance = null;
    private ErrorHandler() {
	ErrorHandler.handleUnsupportedOperationException("msg");
    }

    public static ErrorHandler getInstance() {
        if (instance == null)
            instance = new ErrorHandler();
        return instance;
    }

    public static void handleIllegalArgumentException(String message) {
        throw new IllegalArgumentException(message);
    }

    public static void handleNoSuchMethodException(String message) {
        try { throw new NoSuchMethodException(message);
        } catch (NoSuchMethodException e) { e.printStackTrace(); }
    }

    public static void handleUnsupportedOperationException(String message) {
        throw new UnsupportedOperationException();
    }
}
