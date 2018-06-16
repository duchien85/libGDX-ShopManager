package com.gpteam.shopmanager.npc;

import com.gpteam.shopmanager.character.CharacterInfo;
import com.gpteam.shopmanager.game.engine.modules.random_generator.RandGen;
import com.gpteam.shopmanager.needs.NeedTypes;
import com.gpteam.shopmanager.npc.ai.AI;
import com.gpteam.shopmanager.needs.Needs;
import com.gpteam.shopmanager.society.SocietyClass;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPC extends AI {
    private CharacterInfo characterInfo;
    private Needs needs;
    private SocietyClass societyClass;

    /**
    * Set to false if you want to use lazy initialization
    */
    public NPC(boolean initialize) {
        if (initialize) {
            characterInfo = new CharacterInfo();
            needs = new Needs();
            societyClass = RandGen.getRandomSocietyClass();
        }
    }

    public NPC(SocietyClass societyClass) {
        this.societyClass = societyClass;
    }

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

    public int getNeedValue(NeedTypes need) {
        if (needs == null)
            needs = new Needs();
        return needs.getNeed(need);
    }
}
