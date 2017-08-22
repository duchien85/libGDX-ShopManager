package com.gpteam.shopmanager.engine.modules.utility;

import java.math.BigDecimal;

public final class Utils {
    /** TODO Write wrapper class for BigDecimal, similiar to {@link com.gpteam.shopmanager.time.Date} wrapper class */
    public static void setScale(BigDecimal bigDecimal, int scale) {
        bigDecimal = bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Sets the scale of {@code bigDecimal} to default value of 2 and rounding mode to
     * {@code ROUND_HALF_UP}.
     *
     * @param bigDecimal {@code Bigdecimal} object to have it's scale set
     */
    public static void setScale(BigDecimal bigDecimal) {
        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
