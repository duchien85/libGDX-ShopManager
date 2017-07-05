package com.gpteam.shopmanager.deprecated.traffic;

import com.gpteam.shopmanager.deprecated.ErrorMessages;
import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.random_generator.RandGen;

import static com.gpteam.shopmanager.variables.Variables.MAX_TRAFFIC_LOAD;
import static com.gpteam.shopmanager.variables.Variables.MIN_TRAFFIC_LOAD;

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
            ErrorHandler.handleIllegalArgumentException(ErrorMessages.TRAFFIC_LOAD_EXCEPTION);
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
