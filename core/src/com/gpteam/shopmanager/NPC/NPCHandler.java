package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.NPCBuilder.NPCBuilder;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCHandler {

    private NPCBuilder npcBuilder;
    private NPC[] npcs;
    private int npcAmount;

    public NPCHandler(int npcAmount) {
        npcBuilder = new NPCBuilder();
        npcs = new NPC[npcAmount];
        this.npcAmount = npcAmount;
    }

//    public NPC[] generateRandomNPC() {
//        // TODO figure out how to handle generating and storing npcs
//    }

}
