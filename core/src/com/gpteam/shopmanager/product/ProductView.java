package com.gpteam.shopmanager.product;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.text_handler.Text;

/**
 * Created by masmix on 14.05.2017.

 * Class needs to be initialized AFTER TextHandler class
 */
public final class ProductView {
    public static String[] APPLE;

    private ProductView() { ErrorHandler.handleUnsupportedOperationException("msg"); }

    public static void initialize() {
        APPLE = new String[]{Text.appleName, Text.APPLE_SERIALNAME, Text.appleDescription};
    }

}