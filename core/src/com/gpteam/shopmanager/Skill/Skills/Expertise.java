package com.gpteam.shopmanager.Skill.Skills;

import com.gpteam.shopmanager.Skill.SkillLogic;
import com.gpteam.shopmanager.Text.Text;
import com.gpteam.shopmanager.Variables.Variables;

/*
 * Created by masmix on 20.01.2017.
 */
public class Expertise {
    private int skillLevel;

    public Expertise(int skillLevel) {
        if (skillLevel > Variables.MAX_SKILL_LEVEL || skillLevel < Variables.MIN_SKILL_LEVEL)
            throw new IllegalArgumentException("Wrong skill amount (0 - 120). Found: " + skillLevel + ".");
        else
            this.skillLevel = skillLevel;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public String getName() {
        return Text.expertise;
    }

    public String getDescription() {
        return Text.expertiseDescription;
    }
}