package com.gpteam.shopmanager.Skill.Skills;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Skill.SkillLogic;
import com.gpteam.shopmanager.Text.Text;
import com.gpteam.shopmanager.Variables.Variables;

/*
 * Created by masmix on 20.01.2017.
 */
public class Expertise {
    private short skillLevel;

    public Expertise(short skillLevel) {
        if (skillLevel > Variables.MAX_SKILL_LEVEL || skillLevel < Variables.MIN_SKILL_LEVEL)
            throw new IllegalArgumentException("Wrong skill amount (0 - 120). Found: " + skillLevel + ".");
        else
            this.skillLevel = skillLevel;
    }

    public short getSkillLevel() {
        return skillLevel;
    }

    public void addSkillLevel(short skillLevel) {
        if (validate(skillLevel))
            this.skillLevel += skillLevel;
        else
            ErrorHandler.handleIllegalArgumentException("MSG");
    }

    public String getName() {
        return Text.expertise;
    }

    public String getDescription() {
        return Text.expertiseDescription;
    }

    private boolean validate(short skillLevel) {
        return skillLevel <= Variables.MAX_SKILL_LEVEL && skillLevel >= Variables.MIN_SKILL_LEVEL;
    }
}