package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.NPC.NPCBuilder.NPCBuilder;

import java.util.ArrayList;
import java.util.Arrays;

import static com.gpteam.shopmanager.Variables.Variables.MAX_NPC_AMOUNT;
import static com.gpteam.shopmanager.Variables.Variables.MIN_NPC_AMOUNT;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCHandler {
    private ArrayList<NPC> npcs;
    private int npcCount;


    // TODO COME UP WITH BEST WAY TO HANDLE VALIDATING ARGUMENTS AND ASSIGNING THEM TO CLASS VARIABLES !!! (Character class needs exact same thing)

    public NPCHandler(int npcCount) {
        if (validate(npcCount)) {
            updateNpcCount();
            initialize();
        }
        else throw new IllegalArgumentException("npcCount must be between 0 - 10000. Found: " + npcCount);
    }
    
    public NPCHandler() {
        npcs = new ArrayList<NPC>();
    }

    public int currentNpcCount() {
        return npcCount;
    }

    public void addNpcs(int npcCount) {
        if (validate(npcCount)) {
            for (int i = 0; i < npcCount; i++)
                npcs.add(NPCBuilder.newNPC());
            this.npcCount += npcCount;
        }
        else throw new IllegalArgumentException();


    }

    public void addNpcs(int npcCount, boolean allRandom) {
        if (validate(npcCount)) {
            for (int i = 0; i < npcCount; i++)
                npcs.add(NPCBuilder.newNPC());
            this.npcCount += npcCount;
        }
        else throw new IllegalArgumentException("npcCount must be between 0 - 10000. Found: " + npcCount);
    }
    
    public void removeNpc(NPC npc) {
        if (npcs.contains(npc))
            npcs.remove(npc);
        else throw new IllegalArgumentException();
    }
    
    public void removeNpcs(NPC... npcs) {
            this.npcs.removeAll(Arrays.asList(npcs));
    }

//    public NPC[] generateRandomNPC() {
//        // TODO figure out how to handle generating and storing npcs
//    }

    private void initialize() {
        npcs = NPCBuilder.newNPCArrayList(npcCount);
    }

    private void updateNpcCount() {
        npcCount = npcs.size();
    }
    
    private boolean validate(int npcCount) {
    			return npcCount <= MAX_NPC_AMOUNT && npcCount >= MIN_NPC_AMOUNT;
    }
}









