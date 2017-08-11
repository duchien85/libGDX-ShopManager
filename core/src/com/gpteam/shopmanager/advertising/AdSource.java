package com.gpteam.shopmanager.advertising;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.utility.Utils;
import com.gpteam.shopmanager.society.SocietyClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class AdSource {
    private BigDecimal funds;
    private int adEffectiveness;
    private String name;
    private AdSources adSource;

    private final String MIN_FUNDS = "0";
    private final String MAX_FUNDS;

    /**
     * Not all ad sources will have the same constraints for their funds. For example a radio
     * will have smaller numbers than TV.
     * @param adSource ad source from {@code AdSources class}
     * @param name ad source name
     * @param MAX_FUNDS maximum amount of possible funding
     */
    public AdSource(AdSources adSource, String name, String MAX_FUNDS) {
        if (!AdSources.contains(adSource))
            ErrorHandler.handleIllegalArgumentException("msg");

        if (Integer.valueOf(name) < Integer.valueOf(MIN_FUNDS)
                || Integer.valueOf(name) > Integer.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

        this.adSource = adSource;
        this.funds = new BigDecimal(MIN_FUNDS, new MathContext(30, RoundingMode.HALF_UP));
        Utils.setScale(this.funds, 2);
        this.MAX_FUNDS = MAX_FUNDS;
    }

    /**
     * Increases funds to the ad source.
     * @param amount the exact amount of increase to the funds of the chosen ad source
     */ // TODO more logic that corresponds to the javadoc
    public void increaseFunds(String amount) {
        if (this.funds.doubleValue() + Double.valueOf(amount) < Double.valueOf(MIN_FUNDS)
                || this.funds.doubleValue() + Double.valueOf(amount) > Double.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

            this.funds = this.funds.add(new BigDecimal(amount));
            Utils.setScale(this.funds, 2);
    }

    /**
     * Dncreases funds to the ad source.
     * @param amount the exact amount of decrease to the funds of the chosen ad source
     */
    public void decreaseFunds(String amount) {
        if (this.funds.doubleValue() - Double.valueOf(amount) < Double.valueOf(MIN_FUNDS)
                || this.funds.doubleValue() - Double.valueOf(amount) > Double.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

            this.funds = this.funds.subtract(new BigDecimal(amount));
            Utils.setScale(this.funds, 2);

    }

    public void setFunds(String funds) {
        if (Double.valueOf(funds) < Double.valueOf(MIN_FUNDS)
                || Double.valueOf(funds) > Double.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

            this.funds = new BigDecimal(funds, new MathContext(30, RoundingMode.HALF_UP));
            Utils.setScale(this.funds, 2);
    }

    /**
     * Returns all active ad sources
     * @return Ad sources array, filled with active ad sources.
     */
    // TODO Think about writing separate class that contains information about the ad sources (current funds, etc) - not only the enum
    public AdSources[] getAdSources() {
        return null;
    }

    /**
     * Get the amount of bots that have been influenced by ads from {@code SocietyClass}, given as the argument.
     */
    public int getSocietyClassEffectiveness(SocietyClass societyClass) {
        return 0;
    }

    /**
     * Get the amount of total bots influenced by ads.
     */
    public int getAdEffectiveness() {
        return 0;
    }
}
