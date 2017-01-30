package com.gpteam.shopmanager.Product;

import java.util.Date;

/*
 * Created by masmix on 23.12.2016.
 */
public class Product {
    private String name;
    private String serialName;
    private String description;
    private float price;
    private short quality;
    private int quantity;
    private Date expirationDate;
    private ProductType productType;
    private ProductType[] productTypes;

    public Product(String name, String serialName, String description, float price, short quality, int quantity, ProductType productType, Date expirationDate) {
        this.name = name;
        this.serialName = serialName;
        this.description = description;
        this.price = price;
        this.quality = quality;
        this.quantity = quantity;
        this.productType = productType;
        this.expirationDate = expirationDate;
    }

    public Product(String name, String serialName, String description, float price, short quality, int quantity, Date expirationDate, ProductType... productTypes) {
        this.name = name;
        this.serialName = serialName;
        this.description = description;
        this.price = price;
        this.quality = quality;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.productTypes = productTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialName() {
        return serialName;
    }

    public void setSerialName(String serialName) {
        this.serialName = serialName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public short getQuality() {
        return quality;
    }

    public void setQuality(short quality) {
        this.quality = quality;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getExpirationDay() {
        return expirationDate.getDay();
    }

    public int getExpirationMonth() {
        return expirationDate.getMonth();
    }

    public int getExpirationYear() {
        return expirationDate.getYear();
    }
}
