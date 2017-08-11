package com.gpteam.shopmanager.needs;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.variables.Variables;

import java.util.HashMap;

/*
 * Created by masmix on 19.01.2017.
 */
public class Needs {
    private HashMap<ENeeds, Integer> needs;
    private NeedsLogic needsLogic;
    private boolean containerInitialized = false;

    public enum ENeeds {
        HUNGER, ENTERTAINMENT, APPAREL, HAPPINESS, LUXURY, FIX, AWARNESS
    }

    public Needs() {
        for (ENeeds x : ENeeds.values())
            needs.put(x, 10);
    }

    public int getNeed(ENeeds need) {
        if (!needs.containsKey(need))
            ErrorHandler.handleNoSuchElementException("Needs container does not contain provided need.");

        return needs.get(need);
    }

    public HashMap<ENeeds, Integer> getNeedsHashMap() {
        return needs;
    }

    public void updateNeed(ENeeds need, int value) {
        if (!needs.containsKey(need))
            ErrorHandler.handleNoSuchElementException("Needs container does not contain provided need.");

        if (value < Variables.MIN_NEED_VALUE
                || value > Variables.MAX_NEED_VALUE)
            ErrorHandler.handleIllegalArgumentException("msg");

        needs.put(need, value);
    }
}
