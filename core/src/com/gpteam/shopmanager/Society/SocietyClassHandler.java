package com.gpteam.shopmanager.Society;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.NPC.NPC;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by masmix on 18.01.2017.
 */
public class SocietyClassHandler {
    ArrayList<SocietyClass> societyClass;
    SocietyClass[] societyClasses;

    public SocietyClassHandler(SocietyClass... societyClass) {
        societyClasses = new SocietyClass[SocietyClass.values().length];
        this.societyClass = new ArrayList<SocietyClass>();
        this.societyClass.addAll(Arrays.asList(societyClass));
    }

    public SocietyClassHandler(boolean allRandom) {
        societyClasses = new SocietyClass[SocietyClass.values().length];
        societyClass = new ArrayList<SocietyClass>();
        societyClass.add(societyClasses[MathUtils.random(SocietyClass.values().length)]);
    }
}
