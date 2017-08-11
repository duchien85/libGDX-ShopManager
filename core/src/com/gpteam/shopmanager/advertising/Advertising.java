package com.gpteam.shopmanager.advertising;

import com.gpteam.shopmanager.advertising.sources.AdSource;

import java.math.BigDecimal;

public final class Advertising {
    private String funds;
    public static enum AdSources { Newspaper, Radio, TV }

    public Advertising() {
        // TODO instantiation of ad sources should be done here?
        // Ad sources: Newspaper, Radio, TV
    }

    public String getAdsRevenue() {
        return null;
    }

    public void setFunds(AdSources adSource, String funds) {
    }

    /**
     * Increases funds evenly spread to all ad sources from {@code AdSources} class
     * @param funds the exact number of funds increase
     */
    public void increaseFunds(String funds) {
    }

    /**
     * Increases funds to the ad source given as the first argument.
     * @param adSource Ad source that is going to have it's funds increased
     * @param funds the exact amount of increase to the funds of the chosen ad source
     */
    public void increaseFunds(AdSources adSource, String funds) {
    }

    /**
     * Dncreases funds to the ad source given as the first argument.
     * @param adSource ad source that is going to have it's funds decreased
     * @param funds the exact amount of increase to the funds of the chosen ad source
     */
    public void decreaseFunds(AdSources adSource, String funds) {
    }

    /**
     * Returns all active ad sources
     * @return Ad sources array, filled with active ad sources.
     */
    public AdSources[] getAdSources() {
        return null;
    }

    public void enableSource(AdSources adSource) {
    }

    public void disableSource(AdSources adSource) {
    }
    /**
     * Method that returns most possible outcome of the given
     * increase or decrease of ads funding
     * @return array containing information about the outcome
     */
    private String[] estimateOutcome(String funds) {
        return null;
    }
}
