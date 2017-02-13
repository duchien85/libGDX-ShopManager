package com.gpteam.shopmanager.Traffic;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler;
import com.gpteam.shopmanager.Engine.Modules.Validator;
import com.gpteam.shopmanager.RandomGenerator.RandGen;

import static com.gpteam.shopmanager.Engine.Modules.ErrorMessages.SET_TRAFFIC_LOAD_EXCEPTION_MESSAGE;
import static com.gpteam.shopmanager.Engine.Modules.ErrorMessages.VALIDATE_TRAFFIC_LOAD_EXCEPTION_MESSAGE;

/*
 * Created by masmix on 13.02.2017.
 */
public class TrafficHandler {
    private int trafficLoad;

    public TrafficHandler() {
        trafficLoad = RandGen.getTrafficLoad();
    }

    public int getTrafficLoad() {
        return trafficLoad;
    }

    private void setTrafficLoad(int trafficLoad) {
        this.trafficLoad = trafficLoad;
    }
}
