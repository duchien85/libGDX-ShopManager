package com.gpteam.shopmanager.Inventory;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Product.Product;
import com.gpteam.shopmanager.Product.ProductView;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Created by masmix on 24.12.2016.
 */
public class Inventory {
    private HashMap<String, Product> products;
    private ArrayList<String> serialNames;

    public Inventory(Product... products) {
        this.products = new HashMap<String, Product>();
        initialize(products);
    }

    public Inventory() {
        products = new HashMap<String, Product>();
    }

    public void put(Product product) {
        products.put(product.getSerialName(), product);
        serialNames.add(product.getSerialName());
    }

    public void put(Product... products) {
        for (Product x : products)
            this.products.put(x.getSerialName(), x);
    }

    public void remove(String pVSerialName) {
        if (products.containsKey(pVSerialName))
            products.remove(pVSerialName);
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void remove(String[] pVSerialName) {
        for (int i = 0; i < pVSerialName.length; i++) {
            if (this.products.containsKey(pVSerialName[i]))
                this.products.remove(pVSerialName[i]);
        }
    }

    public String getProductDescription(String pVSerialName) {
        return products.get(pVSerialName).getDescription();
    }

    public String[] getAllProductDescriptions() {
        String[] descriptions = new String[products.size() - 1];
        for (int i = 0; i < descriptions.length; i++) {
            descriptions[i] = products.get(serialNames.get(i)).getDescription();
        }
        return descriptions;
    }

    public Product getProduct(String productViewSerialName) {
        return products.get(productViewSerialName);
    }

    private void initialize(Product[] products) {
        for (Product x : products) {
            this.products.put(x.getSerialName(), x);
            serialNames.add(x.getSerialName());
        }
    }
    
    public class InventoryListener {
    }
}
