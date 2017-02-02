package com.gpteam.shopmanager.Society;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.NPC.NPC;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by masmix on 18.01.2017.
 */
public class SocietyHandler {
    SocietyClass[] societyClasses;

    public SocietyHandler(SocietyClass... societyClasses) {
        initialize(societyClasses);
    }

    public SocietyHandler(boolean initialize, SocietyClass... societyClasses) {
        if (initialize)
            initialize(societyClasses);
    }

    public SocietyHandler(boolean initialize, boolean allRandom) {
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
            getRandomSocietyClasses();
            societyClasses = new SocietyClass[SocietyClass.values().length];
    }

    private void initializeContainer(SocietyClass[] societyClasses) {
        this.societyClasses = societyClasses;
    }

    private void getRandomSocietyClasses() {

    }
}