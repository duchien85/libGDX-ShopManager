package com.gpteam.shopmanager.npc;

import com.gpteam.shopmanager.society.SocietyClass;

import java.util.ArrayList;
import java.util.Arrays;

import static com.gpteam.shopmanager.npc.npc_builder.NPCBuilder.*;
import static com.gpteam.shopmanager.variables.Variables.MAX_NPC_AMOUNT;
import static com.gpteam.shopmanager.variables.Variables.MIN_NPC_AMOUNT;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCHandler {
    private ArrayList<NPC> npcs;
    private int npcCount = 0;


    // TODO COME UP WITH BEST WAY TO HANDLE VALIDATING ARGUMENTS AND ASSIGNING THEM TO CLASS VARIABLES !!! (Character class needs exact same thing)
    // TODO Figure out validating - too much validate methods in different classes that use themselves!
    public NPCHandler(int npcCount) {
        this.npcCount = npcCount;
        initialize();
    }
    
    public NPCHandler() {
        npcs = new ArrayList<NPC>();
    }

    public void startSimulation() {
    }

    public int currentNpcCount() {
        return npcCount;
    }

    public void addNpcs(int npcCount) {
        for (int i = 0; i < npcCount; i++)
            npcs.add(newNPC());
        this.npcCount += npcCount;
        updateNpcCount();
    }

    public void addNpcs(int npcCount, SocietyClass societyClass) {
        for (int i = 0; i < npcCount; i++)
            npcs.add(newNPC(societyClass));
    }

    public void addNpcs(int npcCount, boolean allRandom) {
        for (int i = 0; i < npcCount; i++)
            npcs.add(newNPC());
        this.npcCount += npcCount;
        updateNpcCount();
    }
    
    public void removeNpc(NPC npc) {
        if (npcs.contains(npc)) {
            npcs.remove(npc);
            updateNpcCount();
        }
        else throw new IllegalArgumentException();
    }
    
    public void removeNpcs(NPC... npcs) {
            this.npcs.removeAll(Arrays.asList(npcs));
            updateNpcCount();
    }

//    public NPC[] generateRandomNPC() {
//        // TODO figure out how to handle generating and storing npcs
//    }

    private void initialize() {
        npcs = newNPCArrayList(npcCount);
    }

    private void updateNpcCount() {
        npcCount = npcs.size();
    }
}
