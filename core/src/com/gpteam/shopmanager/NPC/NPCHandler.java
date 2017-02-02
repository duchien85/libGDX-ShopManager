package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.Character.NPCCharacter;
import com.gpteam.shopmanager.NPCBuilder.NPCBuilder;
import com.gpteam.shopmanager.Needs.NeedsHandler;
import com.gpteam.shopmanager.Society.SocietyHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCHandler {
    private NPCCharacter npc;
    private NPCBuilder npcBuilder;
    private ArrayList<NPC> npcs;
    private NeedsHandler needsHandler;
    private SocietyHandler societyHandler;
    private int npcQuantity = 0;

    public static final int MAX_NPC_AMOUNT = 10000;
    public static final int MIN_NPC_AMOUNT = 0;


    public NPCHandler(int npcQuantity) {
        if (npcQuantity > MAX_NPC_AMOUNT || npcQuantity < MIN_NPC_AMOUNT)
            throw new IllegalArgumentException("npcQuantity must be between 0 - 10000. Found: " + npcQuantity);
        else {
            npcBuilder = new NPCBuilder();
            npcs = npcBuilder.newNPCList(npcQuantity);
            this.npcQuantity += npcQuantity;
        }
    }
    
    public NPCHandler() {
        npcs = new ArrayList<NPC>();
    }

    public int currentNpcCount() {
        return npcQuantity;
    }

    public void addNpcs(int npcQuantity) {
    if (npcQuantity > MAX_NPC_AMOUNT || npcQuantity < MIN_NPC_AMOUNT)
            throw new IllegalArgumentException();
        else
            for (int i = 0; i < npcQuantity; i++)
                npcs.add(npcBuilder.newNPC());

        this.npcQuantity += npcQuantity;
    }

    public void addNpcs(int npcQuantity, boolean allRandom) {
        if (npcQuantity > MAX_NPC_AMOUNT || npcQuantity < MIN_NPC_AMOUNT)
            throw new IllegalArgumentException("npcQuantity must be between 0 - 10000. Found: " + npcQuantity);
        else
            for (int i = 0; i < npcQuantity; i++)
                npcs.add(npcBuilder.newNPC(allRandom));

        this.npcQuantity += npcQuantity;

    }
    
    public void removeNpc(NPC npc) {
        if (npcs.contains(npc))
            npcs.remove(npc);
        else
            throw new IllegalArgumentException();
    }

//    public NPC[] generateRandomNPC() {
//        // TODO figure out how to handle generating and storing npcs
//    }
}
