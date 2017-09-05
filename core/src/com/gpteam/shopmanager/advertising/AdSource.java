package com.gpteam.shopmanager.advertising;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.society.SocietyClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static com.gpteam.shopmanager.variables.Variables.MONEY_SCALE;

/**
 * Contains operations such as increase to the funds of add source {@link #increaseFunds}, etc.
 * Make sure you add a corresponding entry to the {@link AdSources} enum. Each instance of this
 * class is it's own ad source.
 *
 * <p>{@code Funds}, {@code amount} fields should always be passed as {@code String}, in integer
 * format.
 */
// TODO much later - make funds decimal
final class AdSource {
    private BigDecimal funds;
    private int adEffectiveness;
    private String name;
    private AdSources adSource;
    private boolean active;

    private final String MIN_FUNDS = "0";
    private final String MAX_FUNDS;

    /**
     * Not all ad sources will have the same constraints for their funds. For example a radio will
     * have smaller maximum available funding, than TV.
     *
     * @param adSource ad source from {@code AdSources class}
     * @param name ad source name
     * @param MAX_FUNDS maximum amount of possible funding
     */
    AdSource(AdSources adSource, String name, String MAX_FUNDS) {
        if (name == null || MAX_FUNDS == null)
            ErrorHandler.handleNullPointerException("msg");

        if (!AdSources.contains(adSource))
            ErrorHandler.handleIllegalArgumentException("msg");

        if (Integer.valueOf(name) < Integer.valueOf(MIN_FUNDS)
                || Integer.valueOf(name) > Integer.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

        this.adSource = adSource;
        this.funds = new BigDecimal(MIN_FUNDS);
        this.funds = this.funds.setScale(MONEY_SCALE, BigDecimal.ROUND_HALF_UP);
        this.MAX_FUNDS = MAX_FUNDS;
    }

    /**
     * Increases funds to the ad source.
     *
     * @param amount the exact amount of increase to the funds of the chosen ad source
     */ // TODO more logic that corresponds to the javadoc
    void increaseFunds(String amount) {
        if (amount == null)
            ErrorHandler.handleNullPointerException("msg");

        if (funds.intValue() + Integer.valueOf(amount) < Integer.valueOf(MIN_FUNDS)
                || funds.intValue() + Integer.valueOf(amount) > Integer.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

        funds = funds.add(new BigDecimal(amount));
        funds = funds.setScale(MONEY_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Dncreases funds to the ad source.
     *
     * @param amount the exact amount of decrease to the funds of the chosen ad source
     */
    void decreaseFunds(String amount) {
        if (amount == null)
            ErrorHandler.handleNullPointerException("msg");

        if (funds.intValue() - Integer.valueOf(amount) < Integer.valueOf(MIN_FUNDS)
                || funds.intValue() - Integer.valueOf(amount) > Integer.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

        funds = funds.subtract(new BigDecimal(amount));
        funds = funds.setScale(MONEY_SCALE, BigDecimal.ROUND_HALF_UP);

    }

    void setFunds(String funds) {
        if (funds == null)
            ErrorHandler.handleNullPointerException("msg");

        if (Integer.valueOf(funds) < Integer.valueOf(MIN_FUNDS)
                || Integer.valueOf(funds) > Integer.valueOf(MAX_FUNDS))
            ErrorHandler.handleIllegalArgumentException("msg");

        this.funds = new BigDecimal(funds, new MathContext(30, RoundingMode.HALF_UP));
        this.funds = this.funds.setScale(MONEY_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    BigDecimal getFunds() {
        return funds;
    }

    String getStringFunds() {
        return funds.toString();
    }

    double getDoubleFunds() {
        return funds.doubleValue();
    }

    /**
     * Get the amount of bots that have been influenced by ads from {@code SocietyClass}, given as
     * the argument.
     */
    int getSocietyClassEffectiveness(SocietyClass societyClass) {
        return 0;
    }

    /**
     * Get the amount of total bots influenced by ads.
     */
    int getAdEffectiveness() {
        return 0;
    }
    
    void activate() {
        if (active)
            ErrorHandler.handleUnsupportedOperationException(adSource.name() + "is already active.");

        active = true;
    }
    
    void deactivate() {
        if (!active)
            ErrorHandler.handleUnsupportedOperationException(adSource.name() + "is already inactive.");

        active = false;
    }
    
    boolean isActive() {
        return active;
    }
}
