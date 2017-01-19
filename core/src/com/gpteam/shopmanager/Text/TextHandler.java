package com.gpteam.shopmanager.Text;

import java.util.HashMap;

/*
 * Created by masmix on 18.01.2017.
 */
public final class TextHandler {
    private HashMap<String, Object> languageMap;

    public TextHandler() {
        languageMap = new HashMap<String, Object>();
        languageMap.put("EN", com.gpteam.shopmanager.Text.Libraries.EN.class);
        languageMap.put("PL", com.gpteam.shopmanager.Text.Libraries.PL.class);
    }

    public void setRegion(String region) {
        if (region.equals("PL"))
            com.gpteam.shopmanager.Text.Libraries.PL.setLanguage();

        else if (region.equals("EN"))
            com.gpteam.shopmanager.Text.Libraries.EN.setLanguage();

        else
            throw new IllegalArgumentException("There's no such region. Found: " + region + ".");
    }
}
