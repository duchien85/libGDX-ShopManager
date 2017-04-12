package com.gpteam.shopmanager.Inventory;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Product.Product;

import java.util.HashMap;

/*
 * Created by masmix on 24.12.2016.
 */
public class Inventory {
    private HashMap<String, Product> products;


    public Inventory(Product... products) {
        this.products = new HashMap<String, Product>();
        initialize(products);
    }

    public Inventory() {
        products = new HashMap<String, Product>();
    }

    public void remove(Product product) {
        if (products.get(product.getSerialName()).equals(product))
            products.remove(product.getSerialName());
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void add(Product product) {
        products.put(product.getSerialName(), product);
    }

    public Product getProduct(String productSerialName) {
        return products.get(productSerialName);
    }

    private void initialize(Product[] products) {
        for (Product x : products)
            this.products.put(x.getSerialName(), x);
    }
}

//    public void remove(Product product) {
//        if (products.get(product.getSerialName()).getSerialName().isEmpty())
//            throw new IndexOutOfBoundsException();
//        else
//            products.remove(product.getSerialName());
//    }