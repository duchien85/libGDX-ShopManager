package com.gpteam.shopmanager.Character;

import com.gpteam.shopmanager.NPC.NPCHandler;
import com.gpteam.shopmanager.NPCBuilder.NPCBuilder;
import com.gpteam.shopmanager.Player.Sex;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCInfo extends Character {

    public NPCInfo(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    public NPCInfo(String name, int age) {
        super(name, age);
    }

    public NPCInfo(String name) {
        super(name);
    }
}
