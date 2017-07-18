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

    public NPC() {
        characterInfo = new CharacterInfo();
        needs = new Needs();
        societyClass = SocietyClass.getRandom();
    }

    public NPC(CharacterInfo characterInfo, Needs needs, SocietyClass societyClass) {
        this.characterInfo = characterInfo;
        this.needs = needs;
        this.societyClass = societyClass;
    }

    public NPC(SocietyClass societyClass) {
        characterInfo = new CharacterInfo();
        needs = new Needs();
        societyClass = societyClass;
    }

    public CharacterInfo getCharacterInfo() {
        return characterInfo;
    }

    public SocietyClass getSocietyClass() {
        return societyClass;
    }

    public int getNeedValue(ENeeds need) {
        return needs.getNeed(need);
    }
}
