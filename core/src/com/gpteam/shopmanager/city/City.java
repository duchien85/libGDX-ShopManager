package com.gpteam.shopmanager.city;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.npc.NPCHandler;
import com.gpteam.shopmanager.variables.Variables;

/*
 * Created by masmix on 02.02.2017.
 */
public class City {
    private String name;
    private int citizens;
    private NPCHandler npcHandler;

    // TODO figure out how to handle assigning npcs
    // to individual areas of the city

    public City(String name, int citizens) {
        if (citizens < Variables.MIN_NPC_AMOUNT || citizens > Variables.MAX_NPC_AMOUNT)
            ErrorHandler.handleIllegalArgumentException("msg");
        // TODO more validation
        initializeCitizens(); // TODO initialize bots in this method
        npcHandler = new NPCHandler(citizens); // TODO receive npc handler instance in constructor?
    }

    private void initializeCitizens() { // TODO needed? initialization already in constructor - in NPCHandler
    }

    public void updateCitizenCount() {
        citizens = npcHandler.currentNpcCount();
    }

    public int getCitizenCount() {
        return citizens;
    }
}