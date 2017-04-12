package com.gpteam.shopmanager.Needs;

import java.util.HashMap;

/*
 * Created by masmix on 19.01.2017.
 */
public class Needs {
    private HashMap<ENeeds, Integer> needs;
    private NeedsLogic needsLogic;
    private boolean containerInitialized = false;

    public Needs() {
        initialize();
    }

    public Needs(boolean initialize) {
        if (initialize) initialize();
    }

    public int getNeedValue(ENeeds need) {
        if (needs.containsKey(need))
            return needs.get(need);
        else
            throw new IllegalArgumentException("Needs container does not contain provided need. Found: " + need.toString());
                // TODO important: move throwing of exceptions from other classes to one module of the engine, that will handle it.
            //return 1; // for later, when engine is done.
    }

    public int getNeed(ENeeds need) {
        if (needs.containsKey(need))
            return needs.get(need);
        else
            return 1;
    }

    public HashMap<ENeeds, Integer> getNeedsHashMap() {
        return needs;
    }

    public void updateNeed(ENeeds need, int value) {
        if (needs.containsKey(need) && needs.containsValue(value))
            needs.put(need, value);
        else
            throw new IllegalArgumentException("Need and value not found in HashMap. Found: " + need.toString() + ", " + value);
    }

    /************************************************************
     * @param needs Needs array to fill Needs container (key)
     * @param values Values array to fill Needs container (value)
     *
     * <p>needs.length must be equal to values.length</p>
     ************************************************************/
    private void initialize(ENeeds[] needs, int[] values) {
        if (needs.length != values.length)
            throw new IllegalArgumentException("Needs array must be the same length as Values array. Found:\nneeds: " + needs.length + "\nvalues: " + values.length);
        else
            fillHashMap(needs, values);
    }

    public void initialize() {
        if (containerInitialized) {
            try { throw new InstantiationException("NeedsHandler has already been initialized.");
            } catch (InstantiationException e) { e.printStackTrace(); }
        } else fillHashMap();
    }

    private void fillHashMap() {
        for (ENeeds x : ENeeds.values())
            needs.put(x, null);
    }

    private void fillHashMap(ENeeds[] needs, int[] values) {
        for (int i = 0; i < needs.length; i++)
            this.needs.put(needs[i], values[i]);
    }
}