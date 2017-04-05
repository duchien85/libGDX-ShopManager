package com.gpteam.shopmanager.Text.Libraries;

import com.gpteam.shopmanager.Text.Text;

import static com.gpteam.shopmanager.Variables.Variables.MAX_TRAFFIC_LOAD;
import static com.gpteam.shopmanager.Variables.Variables.MIN_TRAFFIC_LOAD;

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

        Text.rich = "Rich";
        Text.poor = "Poor";
        Text.drunk = "Drunk";
        Text.middleclass = "Middle class";
        Text.teenager = "Teenager";
        Text.student = "Student";

        Text.constructorErrorMessage = "One of the arguments was invalid. Found: name: ";
        Text.constructorErrorAge = ", age: ";
        Text.constructorErrorSex = ", sex: ";
    }
}
