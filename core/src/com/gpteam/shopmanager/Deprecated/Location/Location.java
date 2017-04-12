package com.gpteam.shopmanager.Deprecated.Location;

import com.gpteam.shopmanager.Society.SocietyClass;
import com.gpteam.shopmanager.Traffic.TrafficHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 24.12.2016.
 */
public class Location {
    private ArrayList<SocietyClass> societyClasses;
    private TrafficHandler trafficHandler;

    private void initialize() {
        trafficHandler = new TrafficHandler();
    }
}
