package com.gpteam.shopmanager.engine.modules.error_handler;

import com.gpteam.shopmanager.engine.interfaces.Module;

/*
 * Created by masmix on 11.02.2017.
 */
public final class ErrorHandler implements Module {
    private ErrorHandler() {
	ErrorHandler.handleUnsupportedOperationException("msg");
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
