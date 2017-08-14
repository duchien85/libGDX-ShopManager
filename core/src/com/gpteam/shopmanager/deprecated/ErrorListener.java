package com.gpteam.shopmanager.deprecated;

import com.gpteam.shopmanager.deprecated.error.Error;

import java.util.ArrayList;

/*
 * Created by masmix on 14.02.2017.
 */
public class ErrorListener {
    private static ArrayList<Error> errors = new ArrayList<Error>(1);

    public static void notify(Error error) {
        errors.add(error);
    }
}
