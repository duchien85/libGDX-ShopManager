package com.gpteam.shopmanager.random_generator;

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
public class RandGen {
    private static RandGen instance = null;

    private RandGen() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    public static RandGen getInstance() {
        if (instance == null)
            instance = new RandGen();
        return instance;
    }

    private static ArrayList<String> names = Loader.getInstance().getAll(); // TODO THIS IS PROBABLY A BAD WAY TO HANDLE THIS. TEST THIS!!!

    public CharacterInfo generateCharacterInfo() {
        return new CharacterInfo(getRandomName(), getRandomAge(), getRandomSex());
    }

    public String getRandomName() {
        return names.get(MathUtils.random(0, names.size() - 1));
    }

    public int getRandomAge() {
        return MathUtils.random(MIN_AGE_LENGTH, MAX_AGE_LENGTH);
    }

    public Sex getRandomSex() {
        return Sex.getRandom();
    }

    public SocietyClass getRandomSocietyClass() {
        return SocietyClass.getRandom();
    }

    public int getRandomTrafficLoad() {
        return MathUtils.random(MIN_TRAFFIC_LOAD, MAX_TRAFFIC_LOAD);
    }
}
