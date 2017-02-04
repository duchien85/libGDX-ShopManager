package com.gpteam.shopmanager.NPCBuilder;

import com.gpteam.shopmanager.NPC.NPC;

import java.util.ArrayList;

/*
 * Created by masmix on 19.01.2017.
 */
public class NPCBuilder {
    private int npcQuantity;

    public static final int MAX_NPC_QUANTITY = 10000;
    public static final int MIN_NPC_QUANTITY = 0;

    public NPCBuilder(int npcQuantity) {
        if (npcQuantity > MAX_NPC_QUANTITY || npcQuantity < MIN_NPC_QUANTITY)
            throw new IllegalArgumentException();
        else
            this.npcQuantity = npcQuantity;
    }

    public NPCBuilder() {
        npcQuantity = 0;
    }

    public int getNPCQuantity() {
        return npcQuantity;
    }
    
    public NPC newNPC() {
        return new NPC(); // TODO allRandom
    }

    public NPC newNPC(boolean allRandom) {
        return new NPC(allRandom);
    }

    public ArrayList<NPC> newNPCList(int npcQuantity) {
        ArrayList<NPC> npcs = new ArrayList<NPC>();
        initialize(npcs, npcQuantity);
        return npcs;
    }

    public ArrayList<NPC> newNPCList(int npcQuantity, int initialCapacity) {
        ArrayList<NPC> npcs;

        if (initialCapacity > MAX_NPC_QUANTITY || initialCapacity < MAX_NPC_QUANTITY) {
            npcs = new ArrayList<NPC>();
            initialize(npcs, npcQuantity);
            return npcs;
        } else {
            npcs = new ArrayList<NPC>(initialCapacity);
            initialize(npcs, npcQuantity);
            return npcs;
        }
    }
    
    public void initialize(ArrayList<NPC> npcs, int npcQuantity) {
        for (int i = 0; i < npcQuantity; i++)
            npcs.add(newNPC());
    }
}
