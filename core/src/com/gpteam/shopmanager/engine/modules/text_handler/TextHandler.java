package com.gpteam.shopmanager.engine.modules.text_handler;

import java.util.HashMap;

import com.gpteam.shopmanager.engine.interfaces.Module;
import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.text_handler.Libraries.EN;
import com.gpteam.shopmanager.engine.modules.text_handler.Libraries.PL;

/**
 * Created by masmix on 18.01.2017.<p>
 * TextHandler class that handles <i>all text translation</i> in the game.
 * This class should be the first to initialize via {@link #initialize()} and {@link #setLanguage(String language)} methods.
 */
public final class TextHandler implements Module {
    private HashMap<String, Class> languageMap;

    public final String EN = "EN";
    public final String PL = "PL";

    public void initialize() {
        languageMap = new HashMap<String, Class>();
        languageMap.put("EN", EN.class);
        languageMap.put("PL", PL.class);
    }

    /**
     * Available languages:<br>
     * <ul>
     *  <li>{@code EN} (English)</li>
     *  <li>{@code PL} (Polish)</li>
     * </ul>
     * @param language Language the game is suppose to be in.<p>
     *                 Available languages:
     *
     */
    public void setLanguage(String language) {
        if (languageMap.containsKey(language)) {
            try {
                languageMap.get(language).getDeclaredMethod("initialize").invoke(null);
            }
            catch (Exception e) {
                com.gpteam.shopmanager.engine.modules.text_handler.Libraries.EN.initialize();
                e.printStackTrace();
            }
        }
        else {
//            ErrorListener.notify();
            ErrorHandler.handleIllegalArgumentException("There's no such region. Found: " + language + ".");
        }
    }
}
