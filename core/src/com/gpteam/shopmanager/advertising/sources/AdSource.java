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
     * Increase funding of ads,
     */
    public void increaseFunds(String amount) {
        if (this.funds.doubleValue() + Double.valueOf(amount) >= Double.valueOf(MIN_FUNDS) &&
            this.funds.doubleValue() + Double.valueOf(amount) <= Double.valueOf(MAX_FUNDS))
            this.funds = this.funds.add(new BigDecimal(amount)); // TODO test
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void decreaseFunds(String amount) {
        if (this.funds.doubleValue() - Double.valueOf(amount) >= Double.valueOf(MIN_FUNDS) &&
            this.funds.doubleValue() - Double.valueOf(amount) <= Double.valueOf(MAX_FUNDS))
            this.funds = this.funds.subtract(new BigDecimal(amount)); // TODO test
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void setFunds(String funds) {
        if (Double.valueOf(funds) >= Double.valueOf(MIN_FUNDS) &&
            Double.valueOf(funds) <= Double.valueOf(MAX_FUNDS)) {
            this.funds = new BigDecimal(funds, new MathContext(30, RoundingMode.HALF_UP));
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
