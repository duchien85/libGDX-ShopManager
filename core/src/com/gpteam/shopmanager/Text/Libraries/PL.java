package com.gpteam.shopmanager.Text.Libraries;

import com.gpteam.shopmanager.Text.Text;

import static com.gpteam.shopmanager.Variables.Variables.MAX_TRAFFIC_LOAD;
import static com.gpteam.shopmanager.Variables.Variables.MIN_TRAFFIC_LOAD;

/*
 * Created by masmix on 18.01.2017.
 */
public final class PL {
    public static void initialize() {
        Text.expertise = "Ekspertyza";
        Text.expertiseDescription = "";

        Text.negotiation = "Negocjacja";
        Text.negotiationDescription = "";

        Text.workQuality = "Jakość pracy";
        Text.workQualityDescription = "";
        Text.sex = "Płeć";
        Text.sexMale = "Mężczyzna";
        Text.sexFemale = "Kobieta";
        Text.constructorErrorMessage = "Jeden z argumentów był niewłaściwy. Znaleziono: imie:  ";
        Text.constructorErrorAge = ", wiek: ";
        Text.constructorErrorSex = ", płeć: ";

        Text.rich = "Bogaci";
        Text.poor = "Biedni";
        Text.drunk = "Pijacy";
        Text.middleclass = "Klasa Srednia";
        Text.teenager = "Nastolatkowie";
        Text.student = "Studenci";

        Text.ERROR_MESSAGE_1 = "";
    }
}
