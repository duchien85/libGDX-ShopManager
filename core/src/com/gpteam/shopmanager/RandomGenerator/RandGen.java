package com.gpteam.shopmanager.RandomGenerator;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.FileHandlers.Loader;
import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.Society.ESocietyClass;

import java.util.ArrayList;

import static com.gpteam.shopmanager.Variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public final class RandGen {
    private static boolean initialized = false;

    public CharacterInfo generateCharacterInfo() {
        return new CharacterInfo(getRandomName(), getRandomAge(), getRandomSex());
    }

    public String getRandomName() {
        ArrayList<String> names = Loader.getAll();
        return names.get(MathUtils.random(0, names.size() - 1));
    }

    public static int getTrafficLoad() {
        return MathUtils.random(MIN_TRAFFIC_LOAD, MAX_TRAFFIC_LOAD);
    }

    public static int getRandomAge() {
        return MathUtils.random(MIN_AGE_LENGTH, MAX_AGE_LENGTH);
    }

    public static Sex getRandomSex() {
        return Sex.getRandom();
    }

    public static ESocietyClass getSocietyClass() {
        return ESocietyClass.getRandom();
    }

    private void initialize() {
        Loader.initialize();
    }
}
