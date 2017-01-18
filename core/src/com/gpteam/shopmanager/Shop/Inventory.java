package com.gpteam.shopmanager.Shop;

import com.gpteam.shopmanager.Product.Product;

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

    public void remove(Product product) {
        if (!(products.get(product.getSerialName()).getSerialName().isEmpty()))
            products.remove(product.getSerialName());
        else
            throw new IndexOutOfBoundsException();
    }

    public void add(Product product) {
        products.put(product.getSerialName(), product);
    }

    public Product getProduct(String productSerialName) {
        return products.get(productSerialName);
    }
}
