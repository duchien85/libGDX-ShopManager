package com.gpteam.shopmanager.product;

import com.gpteam.shopmanager.time.Date;
import com.gpteam.shopmanager.engine.modules.text_handler.TextHandler;

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
     * Remember to initialize the {@link TextHandler} class first!<p>
     * @param pVProduct String array from {@link ProductView} class
     * @param price price of a single product
     * @param quality quality of the whole product quantity
     * @param quantity quantity of all the single products
     * @param expirationDate format: YYYY.MM.DD
     */
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

    public String getSerialName() {
        return serialName;
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
