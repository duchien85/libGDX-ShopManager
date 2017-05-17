package com.gpteam.shopmanager.Inventory;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Product.Product;
import com.gpteam.shopmanager.Variables.Variables;

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
        serialNames = new ArrayList<String>();
        initialize(products);
    }

    public Inventory() {
        products = new HashMap<String, Product>();
        serialNames = new ArrayList<String>();
    }

    public void put(Product product) {
        products.put(product.getSerialName(), product);
        serialNames.add(product.getSerialName());
    }

    public void put(Product... products) {
        for (Product x : products)
            this.products.put(x.getSerialName(), x);
    }

    public void removeProduct(String pVSerialName) {
        if (products.containsKey(pVSerialName))
            products.remove(pVSerialName);
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void removeProducts(String[] pVSerialName) {
        for (int i = 0; i < pVSerialName.length; i++) {
            if (this.products.containsKey(pVSerialName[i]))
                this.products.remove(pVSerialName[i]);
        }
    }

    public void subProductQuantity(String pVSerialName, int quantity) {
        if (products.get(pVSerialName).getQuantity() - quantity < 0)
            products.get(pVSerialName).setQuantity(0);
        else
            products.get(pVSerialName).subQuantity(quantity);
    }

    public void addProductQuantity(String pVSerialName, int quantity) {
        if (products.get(pVSerialName).getQuantity() + quantity <= Variables.MAX_QUANTITY)
            products.get(pVSerialName).addQuantity(quantity);
    }

    public String getProductDescription(String pVSerialName) {
        return products.get(pVSerialName).getDescription();
    }
    
    public float getProductPrice(String pVSerialName) {
        return products.get(pVSerialName).getPrice();
    }

    public String[] getAllProductDescriptions() {
        String[] descriptions = new String[products.size() - 1];
        for (int i = 0; i < descriptions.length; i++) {
            descriptions[i] = products.get(serialNames.get(i)).getDescription();
        }
        return descriptions;
    }

    public Product getProduct(String pViewSerialName) {
        return products.get(pViewSerialName);
    }

    private void initialize(Product[] products) {
        for (Product x : products) {
            this.products.put(x.getSerialName(), x);
            serialNames.add(x.getSerialName());
        }
    }
}
