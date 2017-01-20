package com.gpteam.shopmanager.Skill.Skills;

import com.gpteam.shopmanager.Skill.SkillLogic;
import com.gpteam.shopmanager.Text.Text;
import com.gpteam.shopmanager.Variables.ExpertiseVariables;

/*
 * Created by masmix on 20.01.2017.
 */
public class Expertise {
    private int skillLevel; // TODO zmienic na skillLevel

    public void Expertise(int skillLevel) {
        if (skillLevel > SkillLogic.maxSkillLevel || skillLevel < SkillLogic.minSkillLevel)
            throw new IllegalArgumentException("Wrong skill amount (0 - 120). Found: " + skillLevel + ".");
        else
            ExpertiseVariables.skillLevel = skillLevel;
    }

    public String getName() {
        return Text.expertise;
    }

    public String getDescription() {
        return Text.expertiseDescription;
    }
}