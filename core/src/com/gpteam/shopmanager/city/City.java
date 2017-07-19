package com.gpteam.shopmanager.city;

import com.gpteam.shopmanager.npc.NPCHandler;
import com.gpteam.shopmanager.variables.Variables;

/*
 * Created by masmix on 02.02.2017.
 */
public class City {
    private String name;
    private int population;
    private NPCHandler npcHandler;

    // TODO figure out how to handle assigning npcs
    // to individual areas of the city

    public City(String name, int population) {
        this.name = name;
        if (population >= Variables.MIN_NPC_AMOUNT && population <= Variables.MAX_NPC_AMOUNT) {
            npcHandler = new NPCHandler(population);
        }
    }

    public void updatePopulation() {
        population = npcHandler.currentNpcCount();
    }
}