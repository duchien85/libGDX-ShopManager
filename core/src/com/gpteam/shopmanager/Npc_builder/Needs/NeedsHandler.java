package com.gpteam.shopmanager.Npc_builder.Needs;

import java.util.ArrayList;

/*
 * Created by masmix on 19.01.2017.
 */
public class NeedsHandler {
    private ArrayList<Needs> needs;

    public NeedsHandler(ArrayList<Needs> needs) {
        this.needs = needs;
        this.needs = new ArrayList<Needs>();
    }

    public NeedsHandler() {
        needs = new ArrayList<Needs>();
    }

    public void addNeed(Needs need) {
        if (needs.contains(need))
            needs.add(need);
        else
            throw new IllegalArgumentException("Object already contains this need. Found: " + need);
    }

    public void addNeeds(Needs... need) {
        for (int i = 0; i < need.length; i++) {
            if (needs.contains(need[i]))
                continue;
            else
                needs.add(need[i]);
        }
    }

    public void removeNeed(Needs need) {
        if (this.needs.contains(need.toString()))
            this.needs.remove(need);
    }

    public void removeNeeds(Needs... need) {
        for (int i = 0; i < need.length; i++) {
            if (this.needs.contains(need[i].toString()))
                this.needs.remove(need);
        }
    }

    public ArrayList<Needs> getNeeds() {
        return needs;
    }
}