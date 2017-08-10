package com.gpteam.shopmanager.engine.modules.error_handler.error;

public class Error {
    private String className;
    private String errorMessage;
    private ErrorType errorType;

    public Error(String className, String errorMessage, ErrorType errorType) {
        this.className = className;
        this.errorMessage = errorMessage;
        this.errorType = errorType;
    }

    public String getClassName() {
        return className;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
