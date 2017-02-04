package com.gpteam.shopmanager.Needs;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/*
 * Created by masmix on 19.01.2017.
 */
public class NeedsHandler {
    private HashMap<Needs, Integer> needs;
    private boolean containerInitialized = false;

    public NeedsHandler() {
        initialize();
    }

    public NeedsHandler(boolean initialize) {
        if (initialize) initialize();
    }

    public void updateNeedValue(Needs need, int value) {
        if (needs.containsKey(need) && needs.containsValue(value))
            needs.put(need, value);
        else
            throw new IllegalArgumentException("Need and value not found in HashMap. Found: " + need.name() + ", " + value);
    }

    /************************************************************
     * @param needs Needs array to fill Needs container (key)
     * @param values Values array to fill Needs container (value)
     *
     * <p>needs.length() must be equal to values.length()!</p>
     ************************************************************/
    private void initialize(Needs[] needs, int[] values) {
        if (needs.length == values.length)
            throw new IllegalArgumentException("Needs array must be the same length as Values array. Found:\nneeds: " + needs.length + "\nvalues: " + values.length);
        else
            fillHashMap(needs, values);
    }

    public void initialize() {
        if (containerInitialized) {
            try { throw new InstantiationException("NeedsHandler has already been initialized."); }
            catch (InstantiationException e) { e.printStackTrace(); }
        } else
            fillHashMap();
    }

    private void fillHashMap() {
        for (Needs x : Needs.values())
            needs.put(x, null);
    }

    private void fillHashMap(Needs[] needs, int[] values) {
        for (int i = 0; i < needs.length; i++)
            this.needs.put(needs[i], values[i]);
    }
    
    private class NeedsLogic {
    
    }
}