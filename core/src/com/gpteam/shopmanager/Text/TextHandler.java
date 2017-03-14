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

        // TODO save HashMap to file, load when game is launched
        languageMap.put("EN", EN.class);
        languageMap.put("PL", PL.class);
    }

    /**
     * @param language Language the game is suppose
     *                to be in. Available languages:<p>
     *                 - EN (English)<p>
     *                 - PL (Polish)
     **************************************************/
    public TextHandler(String language) {
        languageMap = new HashMap<String, Class>();
        // TODO save HashMap to file, load when game is launched
        languageMap.put("EN", EN.class);
        languageMap.put("PL", PL.class);
        setLanguage(language);
    }

    public void setLanguage(String language) {
        if (languageMap.containsKey(language)) {
            try {
                languageMap.get(language).getDeclaredMethod("initialize").invoke(null);
            }
            catch (NoSuchMethodException e) {
                EN.initialize();
                e.printStackTrace();
            }
            catch (InvocationTargetException e) {
                EN.initialize();
                e.printStackTrace();
            }
            catch (IllegalAccessException e) {
                EN.initialize();
                e.printStackTrace();
            }
        }
        else
            throw new IllegalArgumentException("There's no such region. Found: " + language + ".");
    }
}
