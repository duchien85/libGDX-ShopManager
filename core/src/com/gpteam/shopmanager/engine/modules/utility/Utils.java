package com.gpteam.shopmanager.engine.modules.utility;

import java.math.BigDecimal;

public final class Utils {
    public static void setScale(BigDecimal bigDecimal, int scale) {
        bigDecimal = bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
    }
}
