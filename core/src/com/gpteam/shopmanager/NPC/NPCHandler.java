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

    private int maxNpcAmount = 10000;
    private int minNpcAmount = 0;
    
    private NeedsHandler needsHandler;
    private SocietyClassHandler societyHandler;

    public NPCHandler(int npcQuantity) {
        npcBuilder = new NPCBuilder(npcQuantity);
        npcs = npcBuilder.newNPCList(npcQuantity);
        initialize(npcs, npcQuantity);
    }

    public int currentNpcCount() {
        return npcQuantity;
    }

    public void initialize(ArrayList<NPC> npcs, int npcQuantity) {
        for (int i = 0; i < npcQuantity; i++) {
            npcs.add(new NPC(true));
        }
    }

    public void addNpcs(int npcAmount) {

    }

    public void addNpcs(int npcAmount, boolean allRandom) {
        if (npcAmount > maxNpcAmount || npcAmount < minNpcAmount)
            throw new IllegalArgumentException();
        else
            npcs.add(npcBuilder.newNPC(npcAmount, allRandom));
    }

//    public NPC[] generateRandomNPC() {
//        // TODO figure out how to handle generating and storing npcs
//    }

}
