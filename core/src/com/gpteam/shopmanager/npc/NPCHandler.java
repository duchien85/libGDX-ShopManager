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
    private int npcCount;


    // TODO COME UP WITH BEST WAY TO HANDLE VALIDATING ARGUMENTS AND ASSIGNING THEM TO CLASS VARIABLES !!! (Character class needs exact same thing)
    // TODO Figure out validating - too much validate methods in different classes that use themselves!
    public NPCHandler(int npcCount) {
        this.npcCount = npcCount;
        npcs = newNPCArrayList(npcCount);
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
    
    public void removeNpc() {
        npcs.remove(0);
        updateNpcCount();
    }
    
    public void removeNpcs(int npcCount) {
        if (npcCount <= npcs.size() - 1) {
            for (int i = 0; i < npcCount; i++)
                npcs.remove(i);
            updateNpcCount();
        }
    }

    private void updateNpcCount() {
        npcCount = npcs.size();
    }
}
