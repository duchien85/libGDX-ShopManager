package com.gpteam.shopmanager.Text;

import java.util.HashMap;

/*
 * Created by masmix on 18.01.2017.
 */
public final class TextHandler {
    private HashMap<String, Object> languageMap;

    public TextHandler() {
        languageMap = new HashMap<String, Object>();
        languageMap.put("EN", EN.class);
        languageMap.put("PL", PL.class);
    }

    public void setRegion(String region) {
        if (region.equals("PL"))
            PL.setLanguage();

        else if (region.equals("EN"))
            EN.setLanguage();

        else
            throw new IllegalArgumentException("There's no such region. Found: " + region + ".");
    }
}
