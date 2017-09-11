package com.gpteam.shopmanager.product.products;

import com.gpteam.shopmanager.engine.modules.text_handler.TextHandler;
import com.gpteam.shopmanager.product.Product;
import com.gpteam.shopmanager.product.ProductCategory;
import com.gpteam.shopmanager.product.ProductType;
import com.gpteam.shopmanager.time.Date;

public class Apple extends Product {
    /**
     * Remember to initialize the {@link TextHandler} class first!
     *
     * @param price          price of a single product (this field is converted to BigDecimal object,
     *                       make sure to pass it this way: 2 places after comma eg. 1.23)
     * @param quality        quality of the whole product quantity
     * @param quantity       quantity of this product
     * @param expirationDate format: YYYY.MM.DD
     */
    public Apple(String price, int quality, int quantity, Date expirationDate) {
        super(price, quality, quantity, expirationDate, ProductType.APPLE, ProductCategory.FOOD);
    }
    @Override
    public String getName() {
    		return Text.appleName;
    }
    
    @Override
    public String getDescription() {
    		return Text.appleDescription;
    }
}
