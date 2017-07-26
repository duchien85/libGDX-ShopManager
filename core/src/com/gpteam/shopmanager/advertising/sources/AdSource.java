package com.gpteam.shopmanager.advertising.sources;

import com.gpteam.shopmanager.society.SocietyClass;

import java.math.BigDecimal;

public interface AdSource {
    /**
     * Increase funding of ads,
     */
    public void increaseFunds();

    public void decreaseFunds();

    /**
     * Get the amount of bots that have been influenced
     * by ads, only from desired society class.
     */
    public int getSocietyClassEffectiveness(SocietyClass societyClass);

    /**
     * Get the amount of total bots influenced by ads.
     */
    public int getAdEffectiveness();
}
