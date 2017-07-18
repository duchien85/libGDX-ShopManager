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
        initialize();
    }

    public int getNeed(ENeeds need) {
        if (needs.containsKey(need))
            return needs.get(need);
        else
            ErrorHandler.handleIllegalArgumentException("Needs container does not contain provided need.");
        return 1;
    }

    public HashMap<ENeeds, Integer> getNeedsHashMap() {
        return needs;
    }

    public void updateNeed(ENeeds need, int value) {
        if (needs.containsKey(need) && value >= Variables.MIN_NEED_VALUE && value <= Variables.MAX_NEED_VALUE)
            needs.put(need, value);
        else
            ErrorHandler.handleIllegalArgumentException("Need not found in HashMap. Found: " + need.toString() + ", " + value);
    }

    /**
     * @param needs Needs array to fill Needs container (key)
     * @param values Values array to fill Needs container (value)
     *
     * <p>needs.length must be equal to values.length</p>
     */
    private void initialize(ENeeds[] needs, int[] values) {
        if (needs.length == values.length)
            fillHashMap(needs, values);
        else
            ErrorHandler.handleIllegalArgumentException(("Needs array must be the same length as Values array. Found:\nneeds: " + needs.length + "\nvalues: " + values.length));
    }

    public void initialize() {
        if (!containerInitialized) {
            fillHashMap(); }
        else
            try { throw new InstantiationException("NeedsHandler has already been initialized."); }
            catch (InstantiationException e) { e.printStackTrace(); }
    }

    private void fillHashMap() {
        for (ENeeds x : ENeeds.values())
            needs.put(x, 10);
    }

    private void fillHashMap(ENeeds[] needs, int[] values) {
        for (int i = 0; i < needs.length; i++)
            this.needs.put(needs[i], values[i]);
    }
}
