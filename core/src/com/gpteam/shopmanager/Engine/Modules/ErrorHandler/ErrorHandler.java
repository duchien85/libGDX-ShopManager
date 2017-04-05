package com.gpteam.shopmanager.Engine.Modules.ErrorHandler;

import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.Player.Sex;

/*
 * Created by masmix on 11.02.2017.
 */
public final class ErrorHandler {
    public static void handleIllegalArgumentException(String message) {
        throw new IllegalArgumentException(message);
    }

    public static void handleNoSuchMethodException(String message) {
        try { throw new NoSuchMethodException(message);
        } catch (NoSuchMethodException e) { e.printStackTrace(); }
    }

    /**
     * {@link CharacterInfo}
     */
    public String getCharacterInfo(String name, int age, Sex sex) {
        return name + ", age: " + age + ", sex: " + sex.toString();
    }
}
