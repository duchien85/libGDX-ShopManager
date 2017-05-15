package com.gpteam.shopmanager.Product;

import com.gpteam.shopmanager.Time.Date;
import com.gpteam.shopmanager.Variables.Variables;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
     *
     * @param pVName Product name from ProductView class
     * @param pVSerialName Product serial name from ProductView class
     * @param pVDescription Product description from ProductView class
     * @param price
     * @param quality
     * @param quantity
     * @param expirationDate format: YYYY.MM.DD
     */
    public Product(String pVName, String pVSerialName, String pVDescription, float price, short quality, int quantity, Date expirationDate) {
        this.name = pVName;
        this.serialName = pVSerialName;
        this.description = pVDescription;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        if (this.quantity + quantity <= Variables.MAX_QUANTITY && this.quantity + quantity >= Variables.MIN_QUANTITY);
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
