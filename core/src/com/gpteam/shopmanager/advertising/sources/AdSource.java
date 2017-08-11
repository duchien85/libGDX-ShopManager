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

    private final String MIN_FUNDS;
    private final String MAX_FUNDS;

    public AdSource(String funds, String MIN_FUNDS, String MAX_FUNDS) {
        this.funds = new BigDecimal(funds, new MathContext(30, RoundingMode.HALF_UP));
        Utils.setScale(this.funds, 2);
        this.MIN_FUNDS = MIN_FUNDS;
        this.MAX_FUNDS = MAX_FUNDS;
    }

    /**
     * Increases funds evenly spread to all ad sources from {@code AdSources} class
     * @param funds the exact number of funds increase
     */ // TODO more logic that corresponds to the javadoc
    public void increaseFunds(String amount) {
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
    public void decreaseFunds(String amount) {
        if (this.funds.doubleValue() - Double.valueOf(amount) >= Double.valueOf(MIN_FUNDS)
                && this.funds.doubleValue() - Double.valueOf(amount) <= Double.valueOf(MAX_FUNDS)) {
            this.funds = this.funds.subtract(new BigDecimal(amount));
            Utils.setScale(this.funds, 2);
        }
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void setFunds(String funds) {
        if (Double.valueOf(funds) >= Double.valueOf(MIN_FUNDS)
                && Double.valueOf(funds) <= Double.valueOf(MAX_FUNDS)) {
            this.funds = new BigDecimal(funds, new MathContext(30, RoundingMode.HALF_UP));
            Utils.setScale(this.funds, 2);
        }
        else
            ErrorHandler.handleIllegalArgumentException("msg");
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
