package com.gpteam.shopmanager.game.engine.modules.logger;

/*
 * Created by masmix on 08.05.2017.
 */
public class Log {
    private String[] log;
    private LogType logType;

    public Log(String className, String message, LogType logType) {
        this.log = new String[2];
        this.log[0] = className;
        this.log[1] = message;
        this.logType = logType;
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

    public LogType getLogType() {
        return logType;
    }
}
