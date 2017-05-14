package com.gpteam.shopmanager.Product;

import java.util.Date;
// TODO add constraints
/*
 * Created by masmix on 23.12.2016.
 */
public class Product {
    private String serialName;
    private float price;
    private short quality;
    private int quantity;
    private Date expirationDate;

    public Product(String pVSerialName, float price, short quality, int quantity, Date expirationDate) {
        this.serialName = serialName;
        this.price = price;
        this.quality = quality;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
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
