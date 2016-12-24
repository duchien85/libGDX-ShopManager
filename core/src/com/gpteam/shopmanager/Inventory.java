package com.gpteam.shopmanager;

import java.util.HashMap;

/*
 * Created by masmix on 24.12.2016.
 */
public class Inventory {
    private HashMap<String, Product> products;


    public Inventory(Product... products) {
        this.products = new HashMap();
        for (Product x : products) {
            this.products.put(x.getSerialName(), x);
        }
    }

    public Product getProduct(String productSerialName) {
        return products.get(productSerialName);
    }
}
