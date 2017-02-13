package com.gpteam.shopmanager.Engine.Modules;

import static com.gpteam.shopmanager.Variables.Variables.MAX_TRAFFIC_LOAD;
import static com.gpteam.shopmanager.Variables.Variables.MIN_TRAFFIC_LOAD;

/*
 * Created by masmix on 13.02.2017.
 */
public final class Validator {
    private static boolean validate(int trafficLoad) {
        if (trafficLoad > MIN_TRAFFIC_LOAD && trafficLoad < MAX_TRAFFIC_LOAD)
            return true;
        else
            return false;
    }
}
