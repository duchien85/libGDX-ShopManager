package com.gpteam.shopmanager.Skill.Skills;

import com.gpteam.shopmanager.Text.Text;

/*
 * Created by masmix on 20.01.2017.
 */
public class Expertise {
    private int skillLevel; // TODO zmienic na skillLevel

    private static int minSkillLevel = 0;
    private static int maxSkillLevel = 120;

    public void Expertise(int skillLevel) {
        if (skillLevel > maxSkillLevel || skillLevel < minSkillLevel)
            throw new IllegalArgumentException("Wrong skill amount (0 - 120). Found: " + skillLevel + ".");
        else
            this.skillLevel = skillLevel;
    }

    public String getName() {
        return Text.expertise;
    }

    public String getDescription() {
        return Text.expertiseDescription;
    }
}