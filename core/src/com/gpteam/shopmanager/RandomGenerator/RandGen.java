package com.gpteam.shopmanager.RandomGenerator;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.FileHandlers.Loaders.NamesLoader;
import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.Society.SocietyClass;

import static com.gpteam.shopmanager.Variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public final class RandGen {
    private NamesLoader namesLoader;

     public RandGen() {
        initialize();
    }

    /**
     * {@link CharacterInfo}
     * @return CharacterInfo object, with random name,
     * age and sex.
     **************************************************/
    public CharacterInfo generateCharacterInfo() {
        return new CharacterInfo(getRandomName(), getRandomAge(), getRandomSex());
    }

    public String getRandomName() {
        return namesLoader.getNames().get(MathUtils.random(0, namesLoader.getNames().size() - 1));
    }

    public static int getTrafficLoad() {
        return MathUtils.random(MIN_TRAFFIC_LOAD, MAX_TRAFFIC_LOAD);
    }

    public int getRandomAge() {
        return MathUtils.random(MIN_AGE_LENGTH, MAX_AGE_LENGTH);
    }

    public static Sex getRandomSex() {
        return Sex.getRandom();
    }

    public static SocietyClass getSocietyClass() {
        return SocietyClass.getRandom();
    }

    private void initialize() {
        initializeNamesLoader();
    }

    private void initializeNamesLoader() {
        namesLoader = new NamesLoader();
    }
}
