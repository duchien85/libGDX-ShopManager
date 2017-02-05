package com.gpteam.shopmanager.RandomGenerator;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.IOHandlers.Loader;
import com.gpteam.shopmanager.IOHandlers.OutputHandlers.NamesLoader;
import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.Variables.Variables;

/*
 * Created by masmix on 04.02.2017.
 */
public class RandomGenerator {
    private NamesLoader namesLoader;

    public RandomGenerator(NamesLoader namesLoader) {
        this.namesLoader = namesLoader;
    }

    public RandomGenerator() {
        namesLoader = new NamesLoader();
    }

    public CharacterInfo generateRandomInfo() {
        return new CharacterInfo(getRandomName(), getRandomAge(), getRandomSex());
    }

    public String getRandomName() {
        String name;
        do { name = namesLoader.getNames().get(MathUtils.random(0, namesLoader.getNames().size() - 1));
        } while (validateName(name));
        return name;
    }

    public int getRandomAge() {
        return MathUtils.random(Variables.MIN_AGE_LENGTH, Variables.MAX_AGE_LENGTH);
    }

    public Sex getRandomSex() {
        return Sex.getRandom();
    }

    private boolean validateName(String name) {
        if (name.length() > Variables.MAX_NAME_LENGTH || name.length() < Variables.MIN_NAME_LENGTH)
            return false;
        else
            return true;
    }
}
