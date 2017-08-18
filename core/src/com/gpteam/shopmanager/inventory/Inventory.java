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

    public Inventory() {
        products = new HashMap<ProductType, Product>();
        productTypes = new ArrayList<ProductType>();
    }

    public Inventory(Product... products) {
        this.products = new HashMap<ProductType, Product>();
        productTypes = new ArrayList<ProductType>(products.length);
        initialize(products);
    }

    public void updateProductsQuantity() {
        allProductsQuantity = 0;
        for (int i = 0; i < products.size(); i++)
            allProductsQuantity += products.get(productTypes.get(i)).getQuantity();
    }

    public void put(Product product) {
        products.put(product.getProductType(), product);
        productTypes.add(product.getProductType());
    }

    public void put(Product... products) { // TODO
        for (Product x : products)
            this.products.put(x.getProductType(), x);
    }

    public void removeProduct(ProductType productType) {
        if (!products.containsKey(productType))
            ErrorHandler.handleNoSuchElementException("msg");

        products.remove(productType);

    }

    public void removeProducts(ProductType... productTypes) {
        if (!products.containsKey(productTypes))
            ErrorHandler.handleNoSuchElementException("msg");

        for (int i = 0; i < productTypes.length; i++) {
            if (this.products.containsKey(productTypes[i]))
                this.products.remove(productTypes[i]);
        }
    }

    public String getProductDescription(ProductType productType) {
        if (!products.containsKey(productType))
            ErrorHandler.handleNoSuchElementException("msg");

        return products.get(productType).getDescription();
    }
    
    public String getProductPrice(ProductType productType) {
        return products.get(productType).getPrice();
    }
    
    public void setProductPrice(ProductType productType, String price) {
        if (!products.containsKey(productType))
            ErrorHandler.handleNoSuchElementException("msg");

        if (Integer.valueOf(price) < 0)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(productType).setPrice(price);
    }

    public void addProductPrice(ProductType productType, String amount) {
        if (!products.containsKey(productType))
            ErrorHandler.handleNoSuchElementException("msg");

        if (Integer.valueOf(amount) < 0)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(productType).addPrice(amount);
    }
    
    public int getProductQuality(ProductType productType) {
        return products.get(productType).getQuality();
    }
                                                        
    public void subProductQuality(ProductType productType, int quality) {
        if (!products.containsKey(productType))
            ErrorHandler.handleNoSuchElementException("msg");

        if (quality < Variables.MIN_QUALITY
                || quality > Variables.MAX_QUALITY)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(productType).subQuality(quality);

    }
    
    public int getProductQuantity(ProductType productType) {
        return products.get(productType).getQuantity();
    }
    
    public void subProductQuantity(ProductType productType, int quantity) {
        if (!products.containsKey(productType))
            ErrorHandler.handleNoSuchElementException("msg");

        if (products.get(productType).getQuantity() - quantity < Variables.MIN_QUANTITY
                || products.get(productType).getQuantity() - quantity > Variables.MAX_QUANTITY)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(productType).subQuantity(quantity);
    }

    public void addProductQuantity(ProductType productType, int quantity) {
        if (!products.containsKey(productType))
            ErrorHandler.handleNoSuchElementException("msg");

        if (products.get(productType).getQuantity() + quantity < Variables.MIN_QUANTITY
                || products.get(productType).getQuantity() + quantity > Variables.MAX_QUANTITY)
            ErrorHandler.handleIllegalArgumentException("msg");

        products.get(productType).addQuantity(quantity);
    }
    
    public void setProductQuantity(ProductType productType, int quantity) {
        if (!products.containsKey(productType))
            ErrorHandler.handleNoSuchElementException("msg");

        if (quantity < Variables.MIN_QUANTITY
                || quantity > Variables.MAX_QUANTITY )
            products.get(productType).setQuantity(quantity);
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public Date getProductExpirationDate(ProductType productType) {
        return products.get(productType).getExpirationDate();
    }

    public String[] getAllProductDescriptions() {
        String[] descriptions = new String[products.size() - 1];
        for (int i = 0; i < descriptions.length; i++)
            descriptions[i] = products.get(productTypes.get(i)).getDescription();
        return descriptions;
    }

    public Product getProduct(ProductType productType) {
        return products.get(productType);
    }

    private void initialize(Product[] products) {
        for (Product x : products) {
            this.products.put(x.getProductType(), x);
            productTypes.add(x.getProductType());
        }
    }
}
