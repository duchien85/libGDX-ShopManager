package com.gpteam.shopmanager.engine.modules.logger;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorType;

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

    public String getLogMessage() {
        return log[1];
    }

    public String getLogClassName() {
        return log[0];
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
