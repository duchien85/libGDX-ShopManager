package com.gpteam.shopmanager.Engine.Modules.ErrorHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 14.02.2017.
 */
public final class ErrorListener {
    private static ErrorType errorType;
    private static ArrayList<ErrorType> errors;

    public static void notify(ErrorType errorType) {
        errors.add(errorType);
    }
}
