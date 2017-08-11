package com.gpteam.shopmanager.advertising;

public enum AdSources {
    NEWSPAPER, RADIO, TV;

    public static boolean contains(AdSources adSource) {
        for (AdSources x : AdSources.values()) {
            if (x.name().contains(adSource.name()))
                return true;
        }
        return  false;
    }
}
