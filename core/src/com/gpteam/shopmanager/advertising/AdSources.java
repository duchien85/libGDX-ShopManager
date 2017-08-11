package com.gpteam.shopmanager.advertising;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;

public enum AdSources {
    NEWSPAPER, RADIO, TV;

    public static boolean contains(AdSources adSource) {
        if (adSource == null)
            ErrorHandler.handleNullPointerException("msg");

        for (AdSources x : AdSources.values()) {
            if (x.name().contains(adSource.name()))
                return true;
        }
        return  false;
    }
}
