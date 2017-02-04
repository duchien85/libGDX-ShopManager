package com.gpteam.shopmanager.Character;

import com.gpteam.shopmanager.NPC.NPCHandler;
import com.gpteam.shopmanager.NPCBuilder.NPCBuilder;
import com.gpteam.shopmanager.Player.Sex;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPCCharacter extends Character {

    public NPCCharacter(String name, int age, Sex sex) {
        super(name, age, sex);
    }

    public NPCCharacter(String name, int age) {
        super(name, age);
    }

    public NPCCharacter(String name) {
        super(name);
    }
}
