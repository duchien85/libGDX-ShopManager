package com.gpteam.shopmanager.company.detailer;

import com.gpteam.shopmanager.company.Company;
import com.gpteam.shopmanager.shop.Shop;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;

public class Detailer extends Company {
    // default product-selling company - Detailer
    private ArrayList<Shop> shops;
    private BigDecimal capital;

    public Detailer(String shortName, String fullName, String capital, Shop... shops) {
        super(shortName, fullName);
        this.capital = new BigDecimal(capital, new MathContext(30));
        this.capital = this.capital.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.shops = new ArrayList<Shop>(shops.length);
        this.shops.addAll(Arrays.asList(shops));
    }
}
