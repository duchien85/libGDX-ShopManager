package com.gpteam.shopmanager.Skill.Skills;

import com.gpteam.shopmanager.Text.Text;

/*
 * Created by masmix on 20.01.2017.
 */
public class Expertise {
private int skillAmount // TODO zmienic na skillLevel

private static int minSkillAmount = 0;
private static int maxSkillAmount = 120;

public void Expertise(int skillAmount) {
if (skillAmount > maxSkillAmount || skillAmount < minSkillAmount)
throw new IllegalArgumentException("Wrong skill amount (0 - 120). Found: " + skillAmount + ".");

else
this.skillAmount = skillAmount;
}

    public String getName() {
        return Text.expertise;
    }

    public String getDescription() {
        return Text.expertiseDescription;
    }
}