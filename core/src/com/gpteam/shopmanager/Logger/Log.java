package com.gpteam.shopmanager.Logger;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorType;

/*
 * Created by masmix on 08.05.2017.
 */
public class Log {
    private String[] log;
    private ErrorType errorType;

    public Log(String[] log, ErrorType errorType) {
        this.log = log;
        this.errorType = errorType;
    }

    public String[] getLog() {
        return log;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
