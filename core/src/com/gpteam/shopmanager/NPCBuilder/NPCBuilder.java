package com.gpteam.shopmanager.NPCBuilder;

import com.gpteam.shopmanager.NPC.NPC;

import java.util.ArrayList;

/*
 * Created by masmix on 19.01.2017.
 */
public class NPCBuilder {
    private int npcQuantity;
    private NPC[] container;

    public NPCBuilder(int npcQuantity) {
        this.npcQuantity = npcQuantity;
    }

    public NPCBuilder() {
        npcQuantity = 1;
    }

    public void setNPCAmount() {

    }

    public NPC newNPC(boolean allRandom) {
        if (allRandom) // TODO
            return new NPC();
        else
            return new NPC();
    }

    public ArrayList<NPC> newNPCList(int npcQuantity) {
        return new ArrayList<NPC>(npcQuantity);
    }

    public ArrayList<NPC> newNPCList() {
        return new ArrayList<NPC>(npcQuantity);
    }

    public NPC[] newNPC(int npcQuantity) {
        container = new NPC[npcQuantity];

        for (int i = 0; i < npcQuantity; i++)
            container[i] = new NPC();
        return container;
    }

    // TODO
    public NPC newNPC(int amount, boolean allRandom) {
        if (allRandom)
            return new NPC();
        else
            return null;
    }

    public NPC[] newNPC() {
        container = new NPC[npcQuantity];
        return container;
    }

    public ArrayList<NPC> addNpcs(int npcQuantity) {
        ArrayList<NPC> npcs = new ArrayList<NPC>();

        if (npcQuantity == 1) {
            npcs.add(new NPC());
            return npcs;
        }
        else {
            for (int i = 0; i < npcQuantity; i++) {
                npcs.add(new NPC());
            }
            return npcs;
        }
    }
}

