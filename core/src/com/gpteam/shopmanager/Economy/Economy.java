package com.gpteam.shopmanager.Economy;

import java.math.BigDecimal;

/*
 * Created by masmix on 02.02.2017.
 */
public class Economy {
    private BigDecimal totalMoney; //needed?
    private float economyBar;
    
    public float getEconomyBar() {
    }

    public void update() {
    }
    
    public BigDecimal getTotalMoney() {
    		return totalMoney;
    }

    public void addTotalMoney(BigDecimal money) {
        totalMoney = totalMoney.add(money);
    }
}
