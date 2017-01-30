package com.gpteam.shopmanager.NPCBuilder;

import com.gpteam.shopmanager.NPC.NPC;

/*
 * Created by masmix on 19.01.2017.
 */
public class NPCBuilder {
    private int amount;
    public NPCBuilder(int amount) {
        this.amount = amount;
    }

    public NPC newNPC() {
        return new NPC();
    }

    public NPC newNPC(boolean allRandom) {
        if (allRandom)
            return new NPC();
        else
            return new NPC();
    }

    public NPC[] newNPC(int amount) {
        NPC[] container = new NPC[amount];

        for (int i = 0; i < amount; i++)
            container[i] = new NPC();
        return container;
    }

    public NPC newNPC(int amount, boolean allRandom) {
        if (allRandom)
            return new NPC();
        else
            return null;
    }
}

