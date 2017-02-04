package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.Character.NPCCharacter;
import com.gpteam.shopmanager.NPCBuilder.NPCBuilder;
import com.gpteam.shopmanager.Needs.NeedsHandler;
import com.gpteam.shopmanager.Society.SocietyHandler;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCHandler {
    private NPCCharacter npc;
    private NPCBuilder npcBuilder;
    private ArrayList<NPC> npcs;
    private NeedsHandler needsHandler;
    private SocietyHandler societyHandler;
    private int npcCount = 0;

    public static final int MAX_NPC_AMOUNT = 10000;
    public static final int MIN_NPC_AMOUNT = 0;


    public NPCHandler(int npcCount) {
        if (npcCount > MAX_NPC_AMOUNT || npcCount < MIN_NPC_AMOUNT)
            throw new IllegalArgumentException("npcCount must be between 0 - 10000. Found: " + npcCount);
        else initialize();
    }
    
    public NPCHandler() {
        npcs = new ArrayList<NPC>();
    }

    public int currentNpcCount() {
        return npcCount;
    }

    public void addNpcs(int npcCount) {
    if (npcCount > MAX_NPC_AMOUNT || npcCount < MIN_NPC_AMOUNT)
            throw new IllegalArgumentException();
        else {
            for (int i = 0; i < npcCount; i++)
                npcs.add(npcBuilder.newNPC());
        }

        this.npcCount += npcCount;
    }

    public void addNpcs(int npcCount, boolean allRandom) {
        if (npcCount > MAX_NPC_AMOUNT || npcCount < MIN_NPC_AMOUNT)
            throw new IllegalArgumentException("npcCount must be between 0 - 10000. Found: " + npcCount);
        else
            for (int i = 0; i < npcCount; i++)
                npcs.add(npcBuilder.newNPC(allRandom));

        this.npcCount += npcCount;

    }
    
    public void removeNpc(NPC npc) {
        if (npcs.contains(npc))
            npcs.remove(npc);
        else
            throw new IllegalArgumentException();
    }
    
    public void removeNpcs(NPC... npcs) throws NoSuchFieldException {
        if (this.npcs.containsAll(Arrays.asList(npcs))) // TODO in the future, check, if sending method argument "npcs", to "containsAll" method of "this.npc? works properly
            this.npcs.removeAll(Arrays.asList(npcs));
        else
            throw new NoSuchFieldException("Provided array is not filled with npcs of this class instance only.\nargument.toString: " + npcs.toString());
    }

//    public NPC[] generateRandomNPC() {
//        // TODO figure out how to handle generating and storing npcs
//    }

    private void initialize() {
        npcBuilder = new NPCBuilder();
        npcs = npcBuilder.newNPCList(npcCount);
        this.npcCount += npcCount;
    }
}
