package com.gpteam.shopmanager.Engine.Modules.TextHandler;

import java.util.HashMap;

import com.gpteam.shopmanager.Engine.Interfaces.Module;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Engine.Modules.TextHandler.Libraries.EN;
import com.gpteam.shopmanager.Engine.Modules.TextHandler.Libraries.PL;

/*
 * Created by masmix on 18.01.2017.
 */
public final class TextHandler implements Module {
    private TextHandler() {
			ErrorHandler.handleUnsupportedOperationException("msg");
			}

    private static HashMap<String, Class> languageMap = new HashMap<String, Class>();

    public static final String EN = "EN";
    public static final String PL = "PL";

    public static void initialize() {
        languageMap.put("EN", EN.class);
        languageMap.put("PL", PL.class);
    }

    /**
     * @param language Language the game is suppose
     *                 to be in. Available languages:<p>
     *                 (remember to initialize this class
     *                 first through initialize method)<p>
     *                 - EN (English)<p>
     *                 - PL (Polish)
     **************************************************/
    public static void setLanguage(String language) {
        if (languageMap.containsKey(language)) {
            try {
                languageMap.get(language).getDeclaredMethod("initialize").invoke(null);
            }
            catch (Exception e) {
                com.gpteam.shopmanager.Engine.Modules.TextHandler.Libraries.EN.initialize();
                e.printStackTrace();
            }
        }
        else {
//            ErrorListener.notify();
            ErrorHandler.handleIllegalArgumentException("There's no such region. Found: " + language + ".");
        }
    }
}
