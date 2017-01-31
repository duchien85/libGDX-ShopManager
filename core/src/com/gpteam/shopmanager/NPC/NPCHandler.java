package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.NPCBuilder.NPCBuilder;
import com.gpteam.shopmanager.Needs.NeedsHandler;
import com.gpteam.shopmanager.Society.SocietyClassHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCHandler {

    private NPCBuilder npcBuilder;
    private ArrayList<NPC> npcs;
    private int npcQuantity;

    public static final int MAX_NPC_AMOUNT = 10000;
    public static final int MIN_NPC_AMOUNT = 0;
    
    private NeedsHandler needsHandler;
    private SocietyClassHandler societyHandler;

    public NPCHandler(int npcQuantity) {
        npcBuilder = new NPCBuilder();
        npcs = npcBuilder.newNPCList(npcQuantity);
    }

    public int currentNpcCount() {
        return npcQuantity;
    }

    public void initialize(ArrayList<NPC> npcs, int npcQuantity) {
        for (int i = 0; i < npcQuantity; i++) {
            npcs.add(npcBuilder.newNPC());
        }
    }

    public void addNpcs(int npcAmount) {
    if (npcAmount > MAX_NPC_AMOUNT || npcAmount < MIN_NPC_AMOUNT)
            throw new IllegalArgumentException();
        else
            for (int i = 0; i < npcAmount; i++)
                npcs.add(npcBuilder.newNPC());
    }

    public void addNpcs(int npcAmount, boolean allRandom) {
        if (npcAmount > MAX_NPC_AMOUNT || npcAmount < MIN_NPC_AMOUNT)
            throw new IllegalArgumentException();
        else
            for (int i = 0; i < npcAmount; i++)
                npcs.add(npcBuilder.newNPC(allRandom));
    }
    
    public void removeNpc(NPC npc) {
    if (npcs.contains(npc)
    npcs.remove(npc)
    else
    throw new IllegalArgumentException();
    }

//    public NPC[] generateRandomNPC() {
//        // TODO figure out how to handle generating and storing npcs
//    }

}
