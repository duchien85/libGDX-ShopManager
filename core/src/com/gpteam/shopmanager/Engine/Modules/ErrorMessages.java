package com.gpteam.shopmanager.Engine.Modules;

import com.gpteam.shopmanager.Text.Text;

/*
 * Created by masmix on 13.02.2017.
 */
public final class ErrorMessages {
    public static String SET_TRAFFIC_LOAD_EXCEPTION_MESSAGE = Text.setTrafficLoadException.equals;
    
    public static void update() {
    				if(SET_TRAFFIC_LOAD_EXCEPTION_MESSAGE != Text.setTrafficLoadException)
    						SET_TRAFFIC_LOAD_EXCEPTION_MESSAGE = Defaults.setTrafficLoadException;
   
    }
}
