package com.gpteam.shopmanager.Logger;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorType;
import com.gpteam.shopmanager.Engine.Modules.EventHandler.IEvent;

/*
 * Created by masmix on 08.05.2017.
 */
public class Log {
    private String[] log;
    private ErrorType errorType;

    public Log(String className, String message) {
        this.log = new String[2];
        this.log[0] = className;
        this.log[1] = message;
    }

    public String[] getLog() {
        return log;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
