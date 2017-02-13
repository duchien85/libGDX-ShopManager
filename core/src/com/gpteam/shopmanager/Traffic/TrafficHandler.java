package com.gpteam.shopmanager.Traffic;

import com.gpteam.shopmanager.Engine.Modules.Validator;
import com.gpteam.shopmanager.RandomGenerator.RandGen;

/*
 * Created by masmix on 13.02.2017.
 */
public class TrafficHandler {
    private int trafficLoad;

    public TrafficHandler() {
        trafficLoad = new RandGen().getTrafficLoad();
    }

    public int getTrafficLoad() {
        return trafficLoad;
    }

    public void setTrafficLoad(int trafficLoad) {
        if (Validator.validateTrafficLoad(trafficLoad))
            this.trafficLoad = trafficLoad;
    }
}
