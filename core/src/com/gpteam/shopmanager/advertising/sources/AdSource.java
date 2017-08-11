package com.gpteam.shopmanager.advertising.sources;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.utility.Utils;
import com.gpteam.shopmanager.society.SocietyClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class AdSource {
    private BigDecimal funds;
    private int adEffectiveness;

    public static enum AdSources { Newspaper, Radio, TV }

    private final String MIN_FUNDS;
    private final String MAX_FUNDS;

    public AdSource(String funds, String MIN_FUNDS, String MAX_FUNDS) {
        this.funds = new BigDecimal(funds, new MathContext(30, RoundingMode.HALF_UP));
        Utils.setScale(this.funds, 2);
        this.MIN_FUNDS = MIN_FUNDS;
        this.MAX_FUNDS = MAX_FUNDS;
    }

    /**
     * Increases funds to the ad source given as the first argument.
     * @param adSource Ad source that is going to have it's funds increased
     * @param funds the exact amount of increase to the funds of the chosen ad source
     */ // TODO more logic that corresponds to the javadoc
    public void increaseFunds(AdSources adSource, String amount) {
        if (this.funds.doubleValue() + Double.valueOf(amount) >= Double.valueOf(MIN_FUNDS)
                && this.funds.doubleValue() + Double.valueOf(amount) <= Double.valueOf(MAX_FUNDS)) {
            this.funds = this.funds.add(new BigDecimal(amount));
            Utils.setScale(this.funds, 2);
        }
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    /**
     * Dncreases funds to the ad source given as the first argument.
     * @param adSource ad source that is going to have it's funds decreased
     * @param funds the exact amount of increase to the funds of the chosen ad source
     */
    public void decreaseFunds(AdSources adSource, String amount) {
        if (this.funds.doubleValue() - Double.valueOf(amount) >= Double.valueOf(MIN_FUNDS)
                && this.funds.doubleValue() - Double.valueOf(amount) <= Double.valueOf(MAX_FUNDS)) {
            this.funds = this.funds.subtract(new BigDecimal(amount));
            Utils.setScale(this.funds, 2);
        }
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void setFunds(AdSources adSource, String funds) {
        if (Double.valueOf(funds) >= Double.valueOf(MIN_FUNDS)
                && Double.valueOf(funds) <= Double.valueOf(MAX_FUNDS)) {
            this.funds = new BigDecimal(funds, new MathContext(30, RoundingMode.HALF_UP));
            Utils.setScale(this.funds, 2);
        }
        else
            ErrorHandler.handleIllegalArgumentException("msg");
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
     * Calculates the most possible outcome of the given increase or decrease of ads funding
     * <ul>
     *   <li>index 0: minimum increase in ???</li>
     *   <li>index 1: maximum increase in ???</li>
     *   <li>index 2: most probable amount of bots influenced</li>
     * </ul>
     * @return array containing information about the outcome
     */
    private String[] estimateOutcome(String funds) {
        return null;
    }

    /**
     * Get the amount of bots that have been influenced
     * by ads, only from desired society class.
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
