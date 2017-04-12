package com.gpteam.shopmanager.Deprecated;

import com.gpteam.shopmanager.RandomGenerator.RandGen;
import com.gpteam.shopmanager.Society.ESocietyClass;

/*
 * Created by masmix on 18.01.2017.
 */
public class SocietyClass {
    private com.gpteam.shopmanager.Society.ESocietyClass ESocietyClass;

    public SocietyClass(ESocietyClass ESocietyClass) {
        this.ESocietyClass = ESocietyClass;
    }

    public SocietyClass() {
        ESocietyClass = RandGen.getSocietyClass();
    }

    public ESocietyClass getESocietyClass() {
        return ESocietyClass;
    }

    public void setESocietyClass(ESocietyClass ESocietyClass) {
        this.ESocietyClass = ESocietyClass;
    }
}
