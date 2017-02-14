package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.Needs.Needs;
import com.gpteam.shopmanager.Needs.NeedsHandler;
import com.gpteam.shopmanager.Society.SocietyClass;
import com.gpteam.shopmanager.Society.SocietyClassHandler;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPC {
    private CharacterInfo characterInfo;
    private NeedsHandler needsHandler;
    private SocietyClassHandler societyClassHandler;

    public NPC() {
        initialize();
    }

    public NPC(CharacterInfo characterInfo, NeedsHandler needsHandler, SocietyClassHandler societyClassHandler) {
        this.characterInfo = characterInfo;
        this.needsHandler = needsHandler;
        this.societyClassHandler = societyClassHandler;
    }
    
    public NPC(SocietyClass societyClass) {
        characterInfo = new CharacterInfo();
        needsHandler = new NeedsHandler();
        societyClassHandler = new SocietyClassHandler(societyClass);
    }

    public CharacterInfo getCharacterInfo() {
        return characterInfo;
    }

    public SocietyClass getSocietyClass() {
        return societyClassHandler.getSocietyClass();
    }

    public int getNeedValue(Needs need) {
        return needsHandler.getNeedValue(need);
    }

    private void initialize() {
        characterInfo = new CharacterInfo();
        initializeHandlers();
    }

    private void initializeHandlers() {
        needsHandler = new NeedsHandler();
        societyClassHandler = new SocietyClassHandler();
    }
}
