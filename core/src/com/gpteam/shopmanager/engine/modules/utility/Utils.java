package com.gpteam.shopmanager.engine.modules.utility;

import java.math.BigDecimal;

public final class Utils {
    /** TODO Write wrapper class for BigDecimal, similiar to {@link com.gpteam.shopmanager.time.Date} wrapper class */
    public static void setScale(BigDecimal bigDecimal, int scale) {
        bigDecimal = bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
    }
}
