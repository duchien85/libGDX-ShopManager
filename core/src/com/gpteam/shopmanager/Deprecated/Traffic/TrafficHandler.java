package com.gpteam.shopmanager.Deprecated.Traffic;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.RandomGenerator.RandGen;

import static com.gpteam.shopmanager.Deprecated.ErrorMessages.TRAFFIC_LOAD_EXCEPTION;
import static com.gpteam.shopmanager.Variables.Variables.MAX_TRAFFIC_LOAD;
import static com.gpteam.shopmanager.Variables.Variables.MIN_TRAFFIC_LOAD;

/*
 * Created by masmix on 13.02.2017.
 */
public class TrafficHandler {
    private int trafficLoad;

    public TrafficHandler() {
        trafficLoad = RandGen.getRandomTrafficLoad();
    }

    public TrafficHandler(int trafficLoad) {
        if (validate(trafficLoad))
            this.trafficLoad = trafficLoad;
        else
            ErrorHandler.handleIllegalArgumentException(TRAFFIC_LOAD_EXCEPTION);
    }

    public int getTrafficLoad() {
        return trafficLoad;
    }

    private void setTrafficLoad(int trafficLoad) {
        this.trafficLoad = trafficLoad;
    }

    private static boolean validate(int trafficLoad) {
        return trafficLoad >= MIN_TRAFFIC_LOAD && trafficLoad <= MAX_TRAFFIC_LOAD;
    }
}
