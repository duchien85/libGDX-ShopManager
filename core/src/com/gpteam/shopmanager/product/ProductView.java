package com.gpteam.shopmanager.product;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.text_handler.Text;
import com.gpteam.shopmanager.engine.modules.text_handler.TextHandler;

/**
 * Created by masmix on 14.05.2017.<p>
 *
 * ProductView class that contains the information on all products in the game.
 * That information is stored in individual arrays named as the product name.
 * Each index contains different info on the product from {@link Text} class.
 * Use this class to create {@link Product} class objects more easily.<br>
 * It goes as follows:
 * <ul>
 * <li>index 0: product name                               productName</li>
 * <li>index 1: product serial name                        PRODUCT_SERIALNAME</li>
 * <li>index 2: product description                        productDescription</li>
 * </ul>
 * Class must be initialized after {@link  TextHandler} class!
 */
public final class ProductView {
    public static String[] apple;

    public static final String APPLE_SERIALNAME = "APPLE";

    private ProductView() { ErrorHandler.handleUnsupportedOperationException("msg"); }

    public static void initialize() {
        apple = new String[]{Text.appleName, APPLE_SERIALNAME, Text.appleDescription};
    }

}