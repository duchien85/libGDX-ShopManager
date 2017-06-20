package com.gpteam.shopmanager.Logger;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorType;

/*
 * Created by masmix on 08.05.2017.
 */
public class Log {
    private String[] log;
    private ErrorType errorType;

    public Log(Loggable log) {
        this.log = log.log;
        this.errorType = log.errorType;
    }

    public String[] getLog() {
        return log;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
