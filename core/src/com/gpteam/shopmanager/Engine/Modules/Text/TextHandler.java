package com.gpteam.shopmanager.Engine.Modules.Text;

import java.util.HashMap;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

/*
 * Created by masmix on 18.01.2017.
 */
public final class TextHandler {
    private TextHandler() {
			ErrorHandler.handleUnsupportedOperationException("msg");
			}

    private HashMap<String, Class> languageMap = new HashMap<String, Class>();

    public TextHandler() {
        languageMap = new HashMap<String, Class>();

//        setLanguage(""); // TODO Add checking for system language

        // TODO save HashMap to file, load when game is launched
        languageMap.put("EN", com.gpteam.shopmanager.Engine.Modules.Text.Libraries.EN.class);
        languageMap.put("PL", com.gpteam.shopmanager.Engine.Modules.Text.Libraries.PL.class);
    }


    public TextHandler(String language) {
        languageMap = new HashMap<String, Class>();
        // TODO save HashMap to file, load when game is launched
        languageMap.put("EN", com.gpteam.shopmanager.Engine.Modules.Text.Libraries.EN.class);
        languageMap.put("PL", com.gpteam.shopmanager.Engine.Modules.Text.Libraries.PL.class);
        setLanguage(language);
    }

    /**
     * @param language Language the game is suppose
     *                to be in. Available languages:<p>
     *                 - EN (English)<p>
     *                 - PL (Polish)
     **************************************************/
    public void setLanguage(String language) {
        if (languageMap.containsKey(language)) {
            try {
                languageMap.get(language).getDeclaredMethod("initialize").invoke(null);
            }
            catch (Exception e) {
                com.gpteam.shopmanager.Engine.Modules.Text.Libraries.EN.initialize();
                e.printStackTrace();
            }
        }
        else {
//            ErrorListener.notify();
            ErrorHandler.handleIllegalArgumentException("There's no such region. Found: " + language + ".");
        }
    }
}
