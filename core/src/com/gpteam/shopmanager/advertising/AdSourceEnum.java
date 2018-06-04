package com.gpteam.shopmanager.advertising;

public enum AdSourceEnum {
    NEWSPAPER, RADIO, TV;

    public static boolean contains(AdSourceEnum adSource) {
        for (AdSourceEnum x : AdSourceEnum.values()) {
            if (x.name().contains(adSource.name()))
                return true;
        }
        return  false;
    }
}
