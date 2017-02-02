package com.gpteam.shopmanager.Needs;

import com.badlogic.gdx.math.MathUtils;

import java.util.Arrays;
import java.util.NoSuchElementException;

/*
 * Created by masmix on 19.01.2017.
 */
public class NeedsHandler {
    private Needs[] needs;
    private static int needsLength = Needs.values().length;


    public NeedsHandler() {
        needs = Needs.values();
    }
    
    public void check() {
    }
}
