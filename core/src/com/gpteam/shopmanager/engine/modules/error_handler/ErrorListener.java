package com.gpteam.shopmanager.engine.modules.error_handler;

import com.gpteam.shopmanager.engine.modules.error_handler.error.Error;
import com.gpteam.shopmanager.engine.modules.error_handler.error.ErrorType;

import java.util.ArrayList;

/*
 * Created by masmix on 14.02.2017.
 */
public final class ErrorListener {
    private static ArrayList<Error> errors;

    private ErrorListener() {}

    public static void notify(Error error) {
        if (errors == null)
            errors = new ArrayList<Error>();
        errors.add(error);
    }
}
