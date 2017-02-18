package com.gpteam.shopmanager.Society;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.NPC.NPC;
import com.gpteam.shopmanager.RandomGenerator.RandGen;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by masmix on 18.01.2017.
 */
public class SocietyClassHandler {
    private SocietyClass societyClass;

    public SocietyClassHandler(SocietyClass societyClass) {
        this.societyClass = societyClass;
    }

    public SocietyClassHandler() {
        societyClass = RandGen.getSocietyClass();
    }

    public SocietyClass getSocietyClass() {
        return societyClass;
    }

    public void setSocietyClass(SocietyClass societyClass) {
        this.societyClass = societyClass;
    }
}
