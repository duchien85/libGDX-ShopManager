package com.gpteam.shopmanager.Engine.Modules.Validator;

import static com.gpteam.shopmanager.Variables.Variables.MAX_TRAFFIC_LOAD;
import static com.gpteam.shopmanager.Variables.Variables.MIN_TRAFFIC_LOAD;

/*
 * Created by masmix on 13.02.2017.
 */
public final class Validator {
    public static boolean validateTrafficLoad(int trafficLoad) {
        return validate(trafficLoad);
    }

    private static boolean validate(int trafficLoad) {
        if (trafficLoad > MIN_TRAFFIC_LOAD && trafficLoad < MAX_TRAFFIC_LOAD)
            return true;
        else
            return false;
    }


}
