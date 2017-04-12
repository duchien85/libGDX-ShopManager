package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.NPC.AI.AI;
import com.gpteam.shopmanager.Needs.ENeeds;
import com.gpteam.shopmanager.Needs.Needs;
import com.gpteam.shopmanager.Society.ESocietyClass;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPC extends AI {
    private CharacterInfo characterInfo;
    private Needs needs;
    private ESocietyClass societyClass;

    public NPC() {
        initialize();
    }

    public NPC(CharacterInfo characterInfo, Needs needs, ESocietyClass societyClass) {
        this.characterInfo = characterInfo;
        this.needs = needs;
        this.societyClass = societyClass;
    }
    
    public NPC(ESocietyClass ESocietyClass) {
        characterInfo = new CharacterInfo();
        needs = new Needs();
        societyClass = ESocietyClass;
    }

    public CharacterInfo getCharacterInfo() {
        return characterInfo;
    }

    public ESocietyClass getSocietyClass() {
        return societyClass;
    }

    public int getNeedValue(ENeeds need) {
        return needs.getNeedValue(need);
    }

    private void initialize() {
        characterInfo = new CharacterInfo();
        initializeHandlers();
    }

    private void initializeHandlers() {
        needs = new Needs();
        societyClass = ESocietyClass.getRandom();
    }
}
