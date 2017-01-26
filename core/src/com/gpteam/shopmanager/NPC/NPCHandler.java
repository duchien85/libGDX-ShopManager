package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.Character.Character;
import com.gpteam.shopmanager.Money.MoneyHandler;
import com.gpteam.shopmanager.NPCBuilder.NPCBuilder;
import com.gpteam.shopmanager.Npc_builder.Needs.NeedsHandler;
import com.gpteam.shopmanager.Society.SocietyClassHandler;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCHandler {
    private NeedsHandler needsHandler;
    private MoneyHandler moneyHandler;
    private SocietyClassHandler societyClassHandler;
    private NPCBuilder npcBuilder;
    private NPC[] npcs;
    private int npcAmount;

    public NPCHandler(int npcAmount) {
        needsHandler = new NeedsHandler();
        moneyHandler = new MoneyHandler();
        societyClassHandler = new SocietyClassHandler();
        npcBuilder = new NPCBuilder();
        npcs = new NPC[npcAmount];
        this.npcAmount = npcAmount;
    }

    public NPC[] generateRandomNPC() {
        for (int i = 0; i < npcAmount; i++) {
            npcs[i] = npcBuilder.newNPC(npcAmount);
        }
        return npcs;
    }

}
