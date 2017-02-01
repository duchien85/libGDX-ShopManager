package com.gpteam.shopmanager.Needs;

import java.util.Arrays;
import java.util.NoSuchElementException;

/*
 * Created by masmix on 19.01.2017.
 */
public class NeedsHandler {
    private Needs[] needs;

    private int maxNeedsLength = Needs.values().length;


    public NeedsHandler() {
    needs = new Needs[maxNeedsLength];
    		for (Needs x : Needs.values())
    				needs[x] = x;
    }

    public NeedsHandler(boolean allRandom) {
    int random = MathUtils.random(19);
    		for (
    }

    public NeedsHandler() {

    }

    public boolean contains(Needs need) {
        if (Arrays.asList(needs).contains(need))
            return true;
        else
            return false;
    }

    // TODO check if it's right
    public boolean containsAll(Needs... needs) {
        if (Arrays.asList(this.needs).containsAll(Arrays.asList(needs)))
            return true;
        else
            return false;
    }

    public Needs getNeed(Needs need) {
        if (Arrays.asList(needs).contains(need))
            return needs[getNeedIndex(need)];
        else
            throw new NoSuchElementException("No element found.");
    }

    private int getNeedIndex(Needs need) {
        for (int i = 0; i < maxNeedsLength; i++) {
            if (needs[i].equals(need))
                return i;
            else
                continue;
        }
        return -1;
    }

    private int getNextFreeIndex() {
        for (int i = 0; i < maxNeedsLength; i++) {
            if (needs[i] == null)
                return i;

            else
                continue;
        }
        return -1;
    }

    public void addNeed(Needs need) {
        if (Arrays.asList(needs).contains(need))
            throw new IllegalArgumentException("Object already contains this need. Found: " + need);
        else
            needs[getNextFreeIndex()] = need;
    }

    public void addNeeds(Needs... need) {
        int availableIndexes; // write new method for this?

        if (getNextFreeIndex() == -1)
            return; // throw exception? which one?
        else
            availableIndexes = needs.length - (getNextFreeIndex() - 1);

        for (int i = 0; i < availableIndexes; i++) {
            if (Arrays.asList(needs).contains(need[i]))
                continue;
            else {
                needs[getNextFreeIndex()] = need[i];
                //nextFreeIndex;
                }
        }
    }

    public void removeNeed(Needs need) {
        if (Arrays.asList(needs).contains(need))
            Arrays.asList(needs).remove(need);
    }

    public void removeNeeds(Needs... needs) {
        Arrays.asList(this.needs).removeAll(Arrays.asList(needs));
    }
}



