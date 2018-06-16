package com.gpteam.shopmanager.deprecated;

import com.gpteam.shopmanager.game.engine.modules.random_generator.RandGen;

/*
 * Created by masmix on 18.01.2017.
 */
public class SocietyClass {
    private com.gpteam.shopmanager.society.SocietyClass ESocietyClass;

    public SocietyClass(com.gpteam.shopmanager.society.SocietyClass ESocietyClass) {
        this.ESocietyClass = ESocietyClass;
    }

    public SocietyClass() {
        ESocietyClass = RandGen.getRandomSocietyClass();
    }

    public com.gpteam.shopmanager.society.SocietyClass getESocietyClass() {
        return ESocietyClass;
    }

    public void setESocietyClass(com.gpteam.shopmanager.society.SocietyClass ESocietyClass) {
        this.ESocietyClass = ESocietyClass;
    }
}
