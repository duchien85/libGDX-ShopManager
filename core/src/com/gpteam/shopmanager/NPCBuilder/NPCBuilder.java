package com.gpteam.shopmanager.NPCBuilder;

import com.gpteam.shopmanager.NPC.NPC;

import java.util.ArrayList;

/*
 * Created by masmix on 19.01.2017.
 */
public class NPCBuilder {

    public NPCBuilder() {
    }
    
    public NPC newNPC() {
        return new NPC();
    }

    public NPC newNPC(boolean allRandom) {
        return new NPC(allRandom);
    }

    public ArrayList<NPC> newNPCList(int npcQuantity) {
        ArrayList<NPC> npcs = new ArrayList<NPC>(npcQuantity);
        initialize(npcs, npcQuantity);
        return npcs;
    }
    
    public void initialize(ArrayList<NPC> npcs, int npcQuantity) {
        for (int i = 0; i < npcQuantity; i++)
            npcs.add(newNPC());
    }
}
