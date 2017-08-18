package com.gpteam.shopmanager.inventory;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.product.Product;
import com.gpteam.shopmanager.product.ProductType;
import com.gpteam.shopmanager.time.Date;
import com.gpteam.shopmanager.variables.Variables;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Created by masmix on 24.12.2016.
 */
public class Inventory {
    private HashMap<ProductType, Product> products;
    private ArrayList<ProductType> productTypes;
    private int allProductsQuantity;

    public Inventory(Product... products) {
        this.products = new HashMap<ProductType, Product>();
        productTypes = new ArrayList<ProductType>(products.length);
        initialize(products);
    }

    public Inventory() {
        products = new HashMap<ProductType, Product>();
        productTypes = new ArrayList<ProductType>();
    }

    public void updateProductsQuantity() {
        allProductsQuantity = 0;
        for (int i = 0; i < products.size() - 1; i++)
            allProductsQuantity += products.get(productTypes.get(i)).getQuantity();
    }

    public void put(Product product) {
        products.put(product.getProductType(), product);
        productTypes.add(product.getProductType());
    }

    public void put(Product... products) {
        for (Product x : products)
            this.products.put(x.getProductType(), x);
    }

    public void removeProduct(String pVSerialName) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        products.remove(pVSerialName);

    }

    public void removeProducts(String... pVSerialName) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        for (int i = 0; i < pVSerialName.length; i++) {
            if (this.products.containsKey(pVSerialName[i]))
                this.products.remove(pVSerialName[i]);
        }
    }

    public String getProductDescription(String pVSerialName) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        return products.get(pVSerialName).getDescription();
    }
    
    public String getProductPrice(String pVSerialName) {
        return products.get(pVSerialName).getPrice();
    }
    
    public void setProductPrice(String pVSerialName, String price) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        if (Integer.valueOf(price) < 0)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(pVSerialName).setPrice(price);
    }

    public void addProductPrice(String pVSerialName, String amount) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        if (Integer.valueOf(amount) < 0)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(pVSerialName).addPrice(amount);
    }
    
    public int getProductQuality(String pVSerialName) {
        return products.get(pVSerialName).getQuality();
    }
                                                        
    public void subProductQuality(String pVSerialName, short quality) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        if (quality < Variables.MIN_QUALITY
                || quality > Variables.MAX_QUALITY)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(pVSerialName).subQuality(quality);

    }
    
    public int getProductQuantity(String pVSerialName) {
        return products.get(pVSerialName).getQuantity();
    }
    
    public void subProductQuantity(String pVSerialName, int quantity) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        if (products.get(pVSerialName).getQuantity() - quantity < Variables.MIN_QUANTITY
                || products.get(pVSerialName).getQuantity() - quantity > Variables.MAX_QUANTITY)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(pVSerialName).subQuantity(quantity);
    }

    public void addProductQuantity(String pVSerialName, int quantity) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        if (products.get(pVSerialName).getQuantity() + quantity < Variables.MIN_QUANTITY
                || products.get(pVSerialName).getQuantity() + quantity > Variables.MAX_QUANTITY)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(pVSerialName).addQuantity(quantity);
    }
    
    public void setProductQuantity(String pVSerialName, int quantity) {
        if (!products.containsKey(pVSerialName))
            ErrorHandler.handleNoSuchElementException("msg");

        if (quantity < Variables.MIN_QUANTITY
                || quantity > Variables.MAX_QUANTITY )
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
            descriptions[i] = products.get(productTypes.get(i)).getDescription();
        return descriptions;
    }

    public Product getProduct(String pViewSerialName) {
        return products.get(pViewSerialName);
    }

    private void initialize(Product[] products) {
        for (Product x : products) {
            this.products.put(x.getProductType(), x);
            productTypes.add(x.getProductType());
        }
    }
}
