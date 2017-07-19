package com.gpteam.shopmanager.engine.modules.random_generator;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.character.CharacterInfo;
import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.loader.Loader;
import com.gpteam.shopmanager.player.Sex;
import com.gpteam.shopmanager.society.SocietyClass;

import java.util.ArrayList;

import static com.gpteam.shopmanager.variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public final class RandGen {
    private static ArrayList<String> names;

    private RandGen() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    public static void initialize() {
        names = Loader.getAll();
    }

    public static CharacterInfo generateCharacterInfo() {
        return new CharacterInfo(getRandomName(), getRandomAge(), getRandomSex());
    }

    // TODO 2 arraylists/arrays containing names and surnames, from Loader.
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
