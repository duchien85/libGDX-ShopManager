package com.gpteam.shopmanager.product;

import com.gpteam.shopmanager.time.Date;
import com.gpteam.shopmanager.engine.modules.text_handler.TextHandler;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

// TODO add constraints
/*
 * Created by masmix on 23.12.2016.
 */
public class Product {
    private String name;
    private String serialName;
    private String description;
    private BigDecimal price;
    private short quality;
    private int quantity;
    private Date expirationDate;
    private static final int BIGDECIMAL_SCALE = 2;

    /**
     * Remember to initialize the {@link TextHandler} class first!
     * @param pVProduct String array from {@link ProductView} class
     * @param price price of a single product (this field is converted
     *              to BigDecimal object, make sure to round 2 places
     *              after comma e.g. 1.23)
     * @param quality quality of the whole product quantity
     * @param quantity quantity of all the single products
     * @param expirationDate format: YYYY.MM.DD
     */
    public Product(String[] pVProduct, String price, short quality, int quantity, Date expirationDate) {
        this.name = pVProduct[0];
        this.serialName = pVProduct[1];
        this.description = pVProduct[2];
        this.price = new BigDecimal(price);
        setScale(this.price);
        this.quality = quality;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    private void setScale(BigDecimal bigDecimal) {
        bigDecimal = bigDecimal.setScale(BIGDECIMAL_SCALE, BigDecimal.ROUND_HALF_UP);
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

    public String getPrice() {
        return price.toPlainString();
    }

    public void setPrice(String price) {
        this.price = new BigDecimal(price);
        setScale(this.price);
    }

    public void addPrice(String amount) {
        price = price.add(new BigDecimal(amount));
        setScale(price);
    }

    public void subPrice(String amount) {
        price = price.subtract(new BigDecimal(amount));
        setScale(price);
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
    
    public void setExpirationDate(int day, int month, int year) {
        expirationDate.setDay(day);
        expirationDate.setMonth(month);
        expirationDate.setYear(year);
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
