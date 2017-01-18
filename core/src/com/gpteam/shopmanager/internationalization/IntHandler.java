package com.gpteam.shopmanager.internationalization;

import com.badlogic.gdx.Gdx;

import java.util.HashMap;

/*
 * Created by masmix on 18.01.2017.
 */
public final class IntHandler {
    private HashMap<String, Object> language;
    private String regionSelected;

    public static String expertise;

    private IntHandler() {
        language.put("EN", EN.class);
        language.put("PL", PL.class);
    }

    public void setRegion(String region) {
        if (language.containsKey(region))
            regionSelected = region;
        else
            throw new IllegalArgumentException("There's no such region. Found: " + region + ".");
    }

    public static class SkillName {
        public static String expertise;
    }

    static class EN {
        IntHandler intHandler;
        String expertise = "Expertise";
        String negotiation = "Negotiation";
        String workQuality = "Quality of work";
    }

    static class PL {
        //IntHandler.Variables  = "Ekspertyza"
        String negotiation = "Negocjacja";
        String workQuality = "Jakość pracy";
    }

    static class Variables {
        public static String expertise;
    }

}
