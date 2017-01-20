package com.gpteam.shopmanager.Text;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import com.gpteam.shopmanager.Text.Libraries.*;
/*
 * Created by masmix on 18.01.2017.
 */
public final class TextHandler {
    private HashMap<String, Class> languageMap;

    public TextHandler() {
        languageMap = new HashMap<String, Class>();
        languageMap.put("EN", EN.class);
        languageMap.put("PL", PL.class);
    }

    public void setLanguage(String language) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (languageMap.containsKey(language))
            languageMap.get(language).getDeclaredMethod("setLanguage").invoke(null);

        else
            throw new IllegalArgumentException("There's no such region. Found: " + language + ".");
    }
}
