package com.gpteam.shopmanager.NPC.NPCBuilder;

import com.gpteam.shopmanager.NPC.NPC;
import com.gpteam.shopmanager.Society.SocietyClass;

import java.util.ArrayList;

/*
 * Created by masmix on 19.01.2017.
 */
public final class NPCBuilder {
    public static NPC newNPC() {
        return new NPC();
    }

    public static ArrayList<NPC> newNPCArrayList(int npcQuantity) {
        ArrayList<NPC> npcs = new ArrayList<NPC>(npcQuantity);
        initialize(npcs, npcQuantity);
        return npcs;
    }

    public static ArrayList<NPC> newNPCArrayList(int npcQuantity, SocietyClass societyClass) {
        ArrayList<NPC> npcs = new ArrayList<NPC>(npcQuantity);
        initialize(npcs, npcQuantity, societyClass);
        return npcs;
    }
    
    public static void initialize(ArrayList<NPC> npcs, int npcQuantity) {
        for (int i = 0; i < npcQuantity; i++)
            npcs.add(newNPC());
    }

    public static void initialize(ArrayList<NPC> npcs, int npcQuantity, SocietyClass societyClass) {
        for (int i = 0; i < npcQuantity; i++)
            npcs.add(new NPC(societyClass));
    }
}
