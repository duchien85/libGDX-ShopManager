package com.gpteam.shopmanager.engine.modules.error_handler;

import java.util.ArrayList;

/*
 * Created by masmix on 14.02.2017.
 */
public final class ErrorListener {
    private static ArrayList<Error> errors;

    public static void notify(Error error) {
        errors.add(error);
    }
}
