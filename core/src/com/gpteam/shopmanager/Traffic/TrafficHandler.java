package com.gpteam.shopmanager.Traffic;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Engine.Modules.Validator.Validator;
import com.gpteam.shopmanager.RandomGenerator.RandGen;

import static com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorMessages.TRAFFIC_LOAD_EXCEPTION;

/*
 * Created by masmix on 13.02.2017.
 */
public class TrafficHandler {
    private int trafficLoad;

    public TrafficHandler() {
        trafficLoad = RandGen.getTrafficLoad();
    }

    public TrafficHandler(int trafficLoad) {
        if (Validator.validateTrafficLoad(trafficLoad))
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
}
