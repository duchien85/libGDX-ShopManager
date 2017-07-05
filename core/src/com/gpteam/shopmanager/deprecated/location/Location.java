package com.gpteam.shopmanager.deprecated.location;

import com.gpteam.shopmanager.society.SocietyClass;
import com.gpteam.shopmanager.deprecated.traffic.TrafficHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 24.12.2016.
 */
public class Location {
    private ArrayList<SocietyClass> ESocietyClasses;
    private TrafficHandler trafficHandler;

    private void initialize() {
        trafficHandler = new TrafficHandler();
    }
}
