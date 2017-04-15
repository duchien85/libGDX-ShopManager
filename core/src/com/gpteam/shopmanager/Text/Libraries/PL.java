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
        Text.constructorErrorMessage = "Jeden z argumentów był niewłaściwy";
        Text.constructorErrorAge = ", wiek: ";
        Text.constructorErrorSex = ", płeć: ";
        Text.setCharacterInfoError = "";
        Text.ERROR_SET_NAME = "Imię jest za krótkie lub za długie. Imię musi mieć co najmniej 2 litery, do 25";
        Text.ERROR_SET_AGE = "Nieprawidłowy wiek. Wiek powinien zawierać się między 12 a 120";
        Text.ERROR_SET_SEX = "Nieprawidłowa płeć";

        Text.rich = "Bogaci";
        Text.poor = "Biedni";
        Text.drunk = "Pijacy";
        Text.middleclass = "Klasa Srednia";
        Text.teenager = "Nastolatkowie";
        Text.student = "Studenci";

        Text.ERROR_MESSAGE_1 = "";
    }
}
