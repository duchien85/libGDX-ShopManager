package com.gpteam.shopmanager.Product;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Engine.Modules.Text.Text;

/*
 * Created by masmix on 14.05.2017.
 */
public final class ProductView {
    private ProductView() { ErrorHandler.handleUnsupportedOperationException("msg"); }

    /** Apple */
    public static String appleName = Text.appleName;
    public static String appleDescription = Text.appleDescription;
    public static final String APPLE_SERIALNAME = "apple";

    /** Next thing */


    public static String[] APPLE = { appleName, APPLE_SERIALNAME, appleDescription };
}
