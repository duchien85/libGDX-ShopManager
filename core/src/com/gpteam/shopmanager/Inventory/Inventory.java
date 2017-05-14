package com.gpteam.shopmanager.Inventory;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Product.Product;
import com.gpteam.shopmanager.Product.ProductView;

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

    public void put(Product product) {
        products.put(product.getSerialName(), product);
    }

    public void put(Product... products) {
        for (Product x : products)
            this.products.put(x.getSerialName(), x);
    }

    public void remove(Product product) {
        if (products.containsKey(product.getSerialName()))
            products.remove(product.getSerialName());
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void remove(Product... products) {
        for (Product x : products) {
            if (this.products.containsKey(x.getSerialName()))
                this.products.remove(x.getSerialName());
        }
    }

    public void getProductDescription(ProductView productView) {
        if (products.containsKey(productView.getSerialName()))
//            products.get(productView.getSerialName()).getDescription();
    }

    public Product getProduct(String productView) {
        return products.get(productView);
    }

    private void initialize(Product[] products) {
        for (Product x : products)
            this.products.put(x.getSerialName(), x);
    }
    
    public class InventoryListener {
    }
}
