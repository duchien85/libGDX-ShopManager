package com.gpteam.shopmanager.Npc_builder.Needs;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by masmix on 19.01.2017.
 */
public class NeedsHandler {
    private String[] needs;

    private int maxNeedsLength = 20;
    private String defaultValue = "0";

    public NeedsHandler(String... needs) {
        this.needs = needs;
        initializeArray();
    }

    public NeedsHandler() {
        initializeArray();
    }

    public String getNeed(String need) {
        if (Arrays.asList(needs).contains(need))
            return needs[getNeedIndex(need)];
        else
            return "No such need. Found: " + need + ".";
    }

    private int getNeedIndex(String need) {
        for (int i = 0; i < maxNeedsLength; i++) {
            if (needs[i].equals(need))
                return i;
            else
                continue;
        }
        return -1;
    }

    private void initializeArray() {
        needs = new String[maxNeedsLength];
        for (int i = 0; i < maxNeedsLength; i++) {
            needs[i] = defaultValue;
        }
    }

    private int getNextFreeIndex() {
        for (int i = 0; i < maxNeedsLength; i++) {
            if (needs[i] == defaultValue)
                return i;
            else
                break;
        }
        return -1;
    }

    public void addNeed(Needs need) {
        if (Arrays.asList(needs).contains(need))
            throw new IllegalArgumentException("Object already contains this need. Found: " + need);
        else
            needs[getNextFreeIndex()] = need.toString();
    }

    public void addNeeds(Needs... need) {
        int availableArrayIndexes = needs.length - (getNextFreeIndex() - 1);

        for (int i = 0; i < availableArrayIndexes; i++) {
            if (Arrays.asList(needs).contains(need[i]))
                continue;
            else
                needs[getNextFreeIndex()] = need[i].toString();
        }
    }

    public void removeNeed(Needs need) {
        if (Arrays.asList(needs).contains(need.toString()))
            Arrays.asList(needs).remove(need);
    }

    public void removeNeeds(Needs... need) {
        for (int i = 0; i < need.length; i++) {
            if (Arrays.asList(needs).contains(need[i]))
                Arrays.asList(needs).remove(need[i]);
            else
                continue;
        }
    }
}