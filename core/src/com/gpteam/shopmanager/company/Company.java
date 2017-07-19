package com.gpteam.shopmanager.company;

public class Company {
    private String shortName;
    private String fullName;

    public Company(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }

    // TODO add constraints
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}