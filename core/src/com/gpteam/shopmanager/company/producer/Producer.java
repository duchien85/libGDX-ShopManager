package com.gpteam.shopmanager.company.producer;

import com.gpteam.shopmanager.company.Company;

public class Producer extends Company {
    // TODO certain production speed (product/sec or min) that may be improved (along with product quality)
    private double productionSpeed;

    public Producer(String shortName, String fullName) {
        super(shortName, fullName);
        productionSpeed = 1;
    }
}
