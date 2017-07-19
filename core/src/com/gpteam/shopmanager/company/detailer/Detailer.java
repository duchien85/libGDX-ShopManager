package com.gpteam.shopmanager.company.detailer;

import com.gpteam.shopmanager.company.Company;
import com.gpteam.shopmanager.shop.Shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Detailer extends Company {
    // default product-selling company - Detailer
    private ArrayList<Shop> shops;
    private BigDecimal capital;

    public Detailer(String shortName, String fullName, BigDecimal capital, Shop... shops) {
        super(shortName, fullName);
        this.capital = capital;
        this.shops.addAll(Arrays.asList(shops));
    }
}
