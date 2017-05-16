package com.gpteam.shopmanager.RandomGenerator;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Loader.Loader;
import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.Society.SocietyClass;

import java.util.ArrayList;

import static com.gpteam.shopmanager.Variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public final class RandGen {
    private RandGen() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    private static ArrayList<String> names = Loader.getAll();

    public static CharacterInfo generateCharacterInfo() {
        return new CharacterInfo(getRandomName(), getRandomAge(), getRandomSex());
    }

    public static String getRandomName() {
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
