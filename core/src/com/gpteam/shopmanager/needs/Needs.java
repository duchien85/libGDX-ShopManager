package com.gpteam.shopmanager.needs;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.variables.Variables;

import java.util.HashMap;

/*
 * Created by masmix on 19.01.2017.
 */
public class Needs {
    private HashMap<NeedTypes, Integer> needs;
    private NeedsLogic needsLogic;
    private boolean containerInitialized = false;

    public Needs() {
        for (NeedTypes x : NeedTypes.values())
            needs.put(x, 10);
    }

    public int getNeed(NeedTypes need) {
        if (!needs.containsKey(need))
            ErrorHandler.handleNoSuchElementException("object is not of NeedTypes instance.");

        return needs.get(need);
    }

    public HashMap<NeedTypes, Integer> getNeedsHashMap() {
        return needs;
    }

    public void updateNeed(NeedTypes need, int value) {
        if (!needs.containsKey(need))
            ErrorHandler.handleNoSuchElementException("object is not of NeedTypes instance.");

        if (value < Variables.MIN_NEED_VALUE
                || value > Variables.MAX_NEED_VALUE)
            ErrorHandler.handleIllegalArgumentException("msg");

        needs.put(need, value);
    }
}
