package com.gpteam.shopmanager.RandomGenerator;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.FileHandlers.Loader;
import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.Society.SocietyClass;

import java.util.ArrayList;

import static com.gpteam.shopmanager.Variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public final class RandGen {
    public static CharacterInfo generateCharacterInfo() {
        if (!Loader.isInitialized())
            Loader.initialize();
        return new CharacterInfo(getRandomName(), getRandomAge(), getRandomSex());
    }

    public static String getRandomName() {
        if (!Loader.isInitialized())
            Loader.initialize();
        ArrayList<String> names = Loader.getAll();
        return names.get(MathUtils.random(0, names.size() - 1));
    }

    public static int getRandomAge() {
        return MathUtils.random(MIN_AGE_LENGTH, MAX_AGE_LENGTH);
    }

    public static Sex getRandomSex() {
        return Sex.getRandom();
    }

    public static SocietyClass getRandomSocietyClass() {
        return SocietyClass.getRandom();
    }

    public static int getRandomTrafficLoad() {
        return MathUtils.random(MIN_TRAFFIC_LOAD, MAX_TRAFFIC_LOAD);
    }
}
