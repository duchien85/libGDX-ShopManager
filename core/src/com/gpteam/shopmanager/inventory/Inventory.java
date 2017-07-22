package com.gpteam.shopmanager.inventory;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.product.Product;
import com.gpteam.shopmanager.time.Date;
import com.gpteam.shopmanager.variables.Variables;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Created by masmix on 24.12.2016.
 */
public class Inventory {
    private HashMap<String, Product> products;
    private ArrayList<String> serialNames;
    private int allProductsQuantity;

    public Inventory(Product... products) {
        this.products = new HashMap<String, Product>();
        serialNames = new ArrayList<String>(products.length);
        initialize(products);
    }

    public Inventory() {
        products = new HashMap<String, Product>();
        serialNames = new ArrayList<String>();
    }

    public void updateProductsQuantity() {
        allProductsQuantity = 0;
        for (int i = 0; i < products.size() - 1; i++)
            allProductsQuantity += products.get(serialNames.get(i)).getQuantity();
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

    public void removeProducts(String... pVSerialName) {
        for (int i = 0; i < pVSerialName.length; i++) {
            if (this.products.containsKey(pVSerialName[i]))
                this.products.remove(pVSerialName[i]);
        }
    }

    public String getProductDescription(String pVSerialName) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleIllegalArgumentException("msg");
        return products.get(pVSerialName).getDescription();
    }
    
    public String getProductPrice(String pVSerialName) {
        return products.get(pVSerialName).getPrice();
    }
    
    public void setProductPrice(String pVSerialName, String price) {
        if (products.containsKey(pVSerialName) &&
            Integer.valueOf(price) >= 0)
            products.get(pVSerialName).setPrice(price);
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void addProductPrice(String pVSerialName, String amount) {
        if (Integer.valueOf(amount) >= 0 && validate(pVSerialName))
            products.get(pVSerialName).addPrice(amount);
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public short getProductQuality(String pVSerialName) {
        return products.get(pVSerialName).getQuality();
    }
                                                        
    public void subProductQuality(String pVSerialName, short quality) {
        if (products.containsKey(pVSerialName) &&
            quality <= Variables.MAX_QUALITY &&
            quality >= Variables.MIN_QUALITY)
            products.get(pVSerialName).subQuality(quality);
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public int getProductQuantity(String pVSerialName) {
        return products.get(pVSerialName).getQuantity();
    }
    
    public void subProductQuantity(String pVSerialName, int quantity) {
        if (products.containsKey(pVSerialName) &&
            products.get(pVSerialName).getQuantity() - quantity >= Variables.MIN_QUANTITY &&
            products.get(pVSerialName).getQuantity() - quantity <= Variables.MAX_QUANTITY)
            products.get(pVSerialName).setQuantity(0);
        else
            products.get(pVSerialName).subQuantity(quantity);
    }

    public void addProductQuantity(String pVSerialName, int quantity) {
        if (products.containsKey(pVSerialName) &&
            products.get(pVSerialName).getQuantity() + quantity <= Variables.MAX_QUANTITY &&
            products.get(pVSerialName).getQuantity() + quantity >= Variables.MIN_QUANTITY)
            products.get(pVSerialName).addQuantity(quantity);
    }
    
    public void setProductQuantity(String pVSerialName, int quantity) {
        if (products.containsKey(pVSerialName) &&
            quantity >= Variables.MIN_QUANTITY &&
            quantity <= Variables.MAX_QUANTITY )
            products.get(pVSerialName).setQuantity(quantity);
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public Date getProductExpirationDate(String pVSerialName) {
        return products.get(pVSerialName).getExpirationDate();
    }

    public String[] getAllProductDescriptions() {
        String[] descriptions = new String[products.size() - 1];
        for (int i = 0; i < descriptions.length; i++)
            descriptions[i] = products.get(serialNames.get(i)).getDescription();
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

    private boolean validate(String pVSerialName) {
        return products.containsKey(pVSerialName);
    }
}
