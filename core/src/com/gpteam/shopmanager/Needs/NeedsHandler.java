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
    private int needsLength;

    public NeedsHandler() {
        initialize();
    }

    public NeedsHandler(boolean initialize) {
        if (initialize)
            initialize();
    }

    public int getNeedsLength() {
        return needsLength;
    }

    private void initialize() {
        needsLength = Needs.values().length;
        initializeHashMap();
    }

    private void initializeHashMap() {
        needs = new HashMap<Needs, Integer>(needsLength);
        fillHashMap();
    }

    private void fillHashMap() {
        for (Needs x : Needs.values())
            needs.put(x, null);
    }
    
    public void updateValue(Needs need, int value) {
        needs.put(need, value);
    }
    
    private class NeedsLogic {
    
    }
}











