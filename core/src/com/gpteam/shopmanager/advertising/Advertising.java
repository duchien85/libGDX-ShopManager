package com.gpteam.shopmanager.advertising;

import java.util.ArrayList;

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
    // TODO Think about writing separate class that contains information about the ad sources (current funds, etc) - not only the enum
    public ArrayList<AdSource> getAllAdSources() {
        return null;
    }

    public void enableSource(AdSources adSource) {
    }

    public void disableSource(AdSources adSource) {
    }
    /**
     * Calculates the most possible outcome of the given increase or decrease of ads funding.
     * If you want to check the decrease to the funds, simply put "-" in front of your value, eg. "-1000".
     * You don't need to put a "+" sign when you want to check the increase to the funds
     * <ul>
     *   <li>index 0: minimum increase in effectiveness</li>
     *   <li>index 1: maximum increase in effectiveness</li>
     *   <li>index 2: most probable amount of bots influenced</li>
     * </ul>
     * @return array containing information about the outcome
     */
    private String[] estimateOutcome(String funds) {
        return null;
    }
}
