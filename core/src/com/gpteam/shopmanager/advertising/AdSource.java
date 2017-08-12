package com.gpteam.shopmanager.advertising;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.utility.Utils;
import com.gpteam.shopmanager.society.SocietyClass;
import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Each instance of this class is it's own ad source. Contains the operations such
 * as increase to the funds of add source {@link #increaseFunds}, etc. Make sure
 * you add a corresponding entry to the {@link AdSources} enum.
 *
 * <p> {@code Funds}, {@code amount} fields should always be passed as {@code String},
 * in integer format.
 */
// TODO much later - make funds decimal
public final class AdSource {
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
        if (name == null || MAX_FUNDS == null)
            ErrorHandler.handleNullPointerException("msg");

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
    protected void increaseFunds(String amount) {
        if (amount == null)
            ErrorHandler.handleNullPointerException("msg");

        if (this.funds.intValue() + Integer.valueOf(amount) < Integer.valueOf(MIN_FUNDS)
                || this.funds.intValue() + Integer.valueOf(amount) > Integer.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

            this.funds = this.funds.add(new BigDecimal(amount));
            Utils.setScale(this.funds, 2);
    }

    /**
     * Dncreases funds to the ad source.
     * @param amount the exact amount of decrease to the funds of the chosen ad source
     */
    protected void decreaseFunds(String amount) {
        if (amount == null)
            ErrorHandler.handleNullPointerException("msg");

        if (this.funds.intValue() - Integer.valueOf(amount) < Integer.valueOf(MIN_FUNDS)
                || this.funds.intValue() - Integer.valueOf(amount) > Integer.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

            this.funds = this.funds.subtract(new BigDecimal(amount));
            Utils.setScale(this.funds, 2);

    }

    protected void setFunds(String funds) {
        if (funds == null)
            ErrorHandler.handleNullPointerException("msg");

        if (Integer.valueOf(funds) < Integer.valueOf(MIN_FUNDS)
                || Integer.valueOf(funds) > Integer.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

            this.funds = new BigDecimal(funds, new MathContext(30, RoundingMode.HALF_UP));
            Utils.setScale(this.funds, 2);
    }

    protected BigDecimal getFunds() {
        return funds;
    }

    protected String getStringFunds() {
        return funds.toString();
    }

    protected int getIntFunds() {
        return funds.intValue();
    }

    /**
     * Get the amount of bots that have been influenced by ads from {@code SocietyClass},
     * given as the argument.
     */
    protected int getSocietyClassEffectiveness(SocietyClass societyClass) {
        return 0;
    }

    /**
     * Get the amount of total bots influenced by ads.
     */
    protected int getAdEffectiveness() {
        return 0;
    }
}
