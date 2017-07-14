package com.gpteam.shopmanager.product;

import com.gpteam.shopmanager.time.Date;

// TODO add constraints
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

    /**
     * {@link ProductView}
     * @param pVName Product name from ProductView class
     * @param pVSerialName Product serial name from ProductView class
     * @param pVDescription Product description from ProductView class
     * @param price
     * @param quality
     * @param quantity
     * @param expirationDate format: YYYY.MM.DD
     */
    // TODO When language will be changed, strings from "pVProduct" array
    // will not change. Find a way to fix this.
    public Product(String[] pVProduct, float price, short quality, int quantity, Date expirationDate) {
        this.name = pVProduct[0];
        this.serialName = pVProduct[1];
        this.description = pVProduct[2];
        this.price = price;
        this.quality = quality;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSerialName() {
        return serialName;
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
    
    public void subQuality(short quality) {
        this.quality -= quality;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void subQuantity(int quantity) {
        this.quantity -= quantity;
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
