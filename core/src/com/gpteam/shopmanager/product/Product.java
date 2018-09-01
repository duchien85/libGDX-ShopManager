package com.gpteam.shopmanager.product;

import com.gpteam.shopmanager.money.Money;
import com.gpteam.shopmanager.time.Date;

import java.math.BigDecimal;

import static com.gpteam.shopmanager.variables.Variables.MONEY_SCALE;

// TODO add constraints
/*
 * Created by masmix on 23.12.2016.
 */
public abstract class Product {
    private ProductType productType;
    private ProductCategory productCategory;
    private BigDecimal price;
    private int quality;
    private int quantity;
    private Date expirationDate;

    /**
     * Base class for all products in the game. Use specific classes as this class is only a blueprint for them,
     * as it is abstract.
     *
     * @param productType enum value of the product you are creating
     * @param price price of a single product (this field is converted to BigDecimal object,
     *              make sure to pass it this way: 2 places after comma eg. 1.23)
     * @param quality quality of the whole product quantity
     * @param quantity quantity of this product
     * @param expirationDate format: YYYY.MM.DD
     */
    public Product(String price, int quality, int quantity,
                   Date expirationDate, ProductType productType, ProductCategory productCategory) {
        this.price = new BigDecimal(price).setScale(MONEY_SCALE, BigDecimal.ROUND_HALF_UP);
        this.quality = quality;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.productType = productType;
        this.productCategory = productCategory;
    }

    public abstract String getName();

    public abstract String getDescription();

    public ProductType getProductType() {
        return productType;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public String getPrice() {
        return price.toPlainString(); // TODO check if this method returns format: X.XX
    }

    public void setPrice(String price) {
        this.price = Money.toBigDecimal(price);
    }

    public void addPrice(String value) {
        price = price.add(Money.toBigDecimal(value));
    }

    public void subPrice(String value) {
        price = price.subtract(Money.toBigDecimal(value));
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    
    public void subQuality(int quality) {
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
