package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.NPC.AI.AI;
import com.gpteam.shopmanager.Needs.Needs;
import com.gpteam.shopmanager.Needs.Needs.ENeeds;
import com.gpteam.shopmanager.Society.SocietyClass;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPC extends AI {
    private CharacterInfo characterInfo;
    private Needs needs;
    private SocietyClass societyClass;

    public NPC() {
        initialize();
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

    private void initialize() {
        characterInfo = new CharacterInfo();
        needs = new Needs();
        societyClass = SocietyClass.getRandom();
    }
}
