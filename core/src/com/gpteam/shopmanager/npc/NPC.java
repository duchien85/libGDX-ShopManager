package com.gpteam.shopmanager.npc;

import com.gpteam.shopmanager.character.CharacterInfo;
import com.gpteam.shopmanager.npc.ai.AI;
import com.gpteam.shopmanager.needs.Needs;
import com.gpteam.shopmanager.needs.Needs.ENeeds;
import com.gpteam.shopmanager.society.SocietyClass;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPC extends AI {
    private CharacterInfo characterInfo;
    private Needs needs;
    private SocietyClass societyClass;

    public NPC() {}

    public CharacterInfo getCharacterInfo() {
        if (characterInfo == null)
            characterInfo = new CharacterInfo();
        return characterInfo;
    }

    public SocietyClass getSocietyClass() {
        if (societyClass == null)
            societyClass = SocietyClass.getRandom();
        return societyClass;
    }

    public int getNeedValue(ENeeds need) {
        if (needs == null)
            needs = new Needs();
        return needs.getNeed(need);
    }
}
