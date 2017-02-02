package com.gpteam.shopmanager.Needs;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

/*
 * Created by masmix on 19.01.2017.
 */
public class NeedsHandler {
    private HashMap<Needs, Integer> needs;
    private static int needsLength = Needs.values().length;

    public NeedsHandler() {
        initializeHashMap(needs, needsLength);
    }

    public NeedsHandler(boolean initializeNeedsHandler) {
        if (initializeNeedsHandler)
            initializeHashMap(needs, needsLength);
    }

    public int getNeedsLength() {
        return needsLength;
    }
    
    public void check() {
    }

    private void initializeHashMap(HashMap<Needs, Integer> hashMap, int initialCapacity) {
        hashMap = new HashMap<Needs, Integer>(initialCapacity);
        for (HashMap.Entry<Needs, Integer> entry : hashMap.entrySet()) {
            for (Needs x : Needs.values())
                hashMap.put(x, null);
        }
    }
}