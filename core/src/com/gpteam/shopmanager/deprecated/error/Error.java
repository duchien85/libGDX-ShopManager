package com.gpteam.shopmanager.deprecated.error;

public class Error {
    private String className;
    private String errorMessage;
    private ErrorType errorType;

    public Error(Class _class, String errorMessage, ErrorType errorType) {
        this.className = _class.getSimpleName();
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
