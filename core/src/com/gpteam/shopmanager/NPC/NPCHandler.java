package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.NPCBuilder.NPCBuilder;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCHandler {

    private NPCBuilder npcBuilder;
    private NPC[] npcs;
    private int npcAmount;
    
    private NeedsHandler needsHandler;
    private SocietyClassHandler societyHandler;

    public NPCHandler(int npcAmount) {
        npcBuilder = new NPCBuilder();
        npcs = new NPC[npcAmount];
        this.npcAmount = npcAmount;
    }
    
    public void initialize() {
    	npcBuilder = new NPCBuilder();
    	npcs = npcBuilder.newNPC(npcAmount);
    }




//    public NPC[] generateRandomNPC() {
//        // TODO figure out how to handle generating and storing npcs
//    }

}
