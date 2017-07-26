package com.gpteam.shopmanager.advertising;

import com.gpteam.shopmanager.advertising.sources.AdSource;

import java.math.BigDecimal;

public final class Advertising {
    private String funds;
    public static enum AdSources { Newspaper, Radio, TV }


    public String getAdsRevenue() {
        return null;
    }

    public void setFunds(AdSources adSource, String funds) {
    }

    public void increaseFunds(String funds) {
    }

    public void increaseFunds(AdSources adSource, String funds) {
    }

    public void decreaseFunds(AdSources adSource, String funds) {
    }

    /**
     * Method that returns most possible outcome of the given
     * increase or decrease of ads funding
     * @return
     */
    private String[] estimateOutcome(String funds) {
        return null;
    }
}
