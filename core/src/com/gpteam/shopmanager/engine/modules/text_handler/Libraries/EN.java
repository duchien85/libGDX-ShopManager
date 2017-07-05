package com.gpteam.shopmanager.engine.modules.text_handler.Libraries;

import com.gpteam.shopmanager.engine.modules.text_handler.Text;

/*
 * Created by masmix on 18.01.2017.
 */
public final class EN {
    public static void initialize() {
        Text.expertise = "Expertise";
        Text.expertiseDescription = "";

        Text.negotiation = "Negotiation";
        Text.negotiationDescription = "";

        Text.workQuality = "Work Quality";
        Text.workQualityDescription = "";
        Text.sex = "Sex";
        Text.sexMale = "Man";
        Text.sexFemale = "Woman";
        Text.ERROR_CONSTRUCTOR = "One of the arguments was invalid";
        Text.ERROR_CONSTRUCTOR_AGE = ", age: ";
        Text.ERROR_CONSTRUCTOR_SEX = ", sex: ";
        Text.ERROR_CHARACTER_INFO = "";
        Text.ERROR_SET_NAME = "Invalid name. Name is either too long or too short. It must contain at least 2 characters, up to 25";
        Text.ERROR_SET_AGE = "Invalid age. Age must be at least 12 and no higher than 120";
        Text.ERROR_SET_SEX = "Invalid sex. Sex must be either male or female";

        Text.rich = "Rich";
        Text.poor = "Poor";
        Text.drunk = "Drunk";
        Text.middleclass = "Middle class";
        Text.teenager = "Teenager";
        Text.student = "Student";

        Text.ERROR_MESSAGE_1 = "";
    }
}
