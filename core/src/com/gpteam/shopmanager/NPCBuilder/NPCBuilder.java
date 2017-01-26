package com.gpteam.shopmanager.NPCBuilder;

import com.gpteam.shopmanager.NPC.NPC;

/*
 * Created by masmix on 19.01.2017.
 */
public class NPCBuilder {

    public NPCBuilder() {
    }

    public NPC newNPC(int amount) {
        return new NPC();
    }

    public NPC newNPC(boolean allRandom) {
        if (allRandom)
            return new NPC();
        else
            return null;
    }
}

