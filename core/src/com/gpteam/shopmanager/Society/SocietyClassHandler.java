package com.gpteam.shopmanager.Society;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.NPC.NPC;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by masmix on 18.01.2017.
 */
public class SocietyClassHandler {
    SocietyClass[] societyClasses;

    public SocietyClassHandler(SocietyClass... societyClasses) {
        initialize(societyClasses);
    }

    public SocietyClassHandler(boolean initialize, SocietyClass... societyClasses) {
        if (initialize)
            initialize(societyClasses);
    }

    public SocietyClassHandler(boolean initialize, boolean allRandom) {
        if (initialize)
            initialize(societyClasses);
    }

    private void initialize(SocietyClass[] societyClasses) {
        initializeContainer(societyClasses);
    }

    private void initialize(boolean allRandom) {
        initializeContainer(allRandom);
    }

    private void initializeContainer(boolean allRandom) {
        if (allRandom)
            societyClasses = getRandomSocietyClasses();
    }

    private void initializeContainer(SocietyClass[] societyClasses) {
        this.societyClasses = societyClasses;
    }

    private SocietyClass[] getRandomSocietyClasses() {
        // TODO method body
        return null;
    }
}
