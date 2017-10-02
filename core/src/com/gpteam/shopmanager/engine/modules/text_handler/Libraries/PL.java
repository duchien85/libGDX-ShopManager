package com.gpteam.shopmanager.engine.modules.text_handler.Libraries;

import com.gpteam.shopmanager.engine.modules.text_handler.Text;

/*
 * Created by masmix on 18.01.2017.
 */
public final class PL {
    private PL() {}

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
        Text.ERROR_CONSTRUCTOR = "Jeden z argumentów był niewłaściwy";
        Text.ERROR_CONSTRUCTOR_AGE = ", wiek: ";
        Text.ERROR_CONSTRUCTOR_SEX = ", płeć: ";
        Text.ERROR_CHARACTER_INFO = "";
        Text.ERROR_SET_NAME = "Imię jest za krótkie lub za długie. Imię musi posiadać co najmniej 2 litery, do 25";
        Text.ERROR_SET_AGE = "Nieprawidłowy wiek. Wiek powinien zawierać się między 12 a 120";
        Text.ERROR_SET_SEX = "Nieprawidłowa płeć";
        Text.age = "lat";

        Text.male = "mężczyzna";
        Text.female = "kobieta";

        Text.rich = "Bogaci";
        Text.poor = "Biedni";
        Text.drunk = "Pijacy";
        Text.middleclass = "Klasa Srednia";
        Text.teenager = "Nastolatkowie";
        Text.student = "Studenci";

        Text.ERROR_MESSAGE_1 = "";

        Text.appleName = "Jabłko";
        Text.appleDescription = "Opis";

        Text.newspaper = "Gazeta";
        Text.radio = "Radio";
        Text.tv = "TV";
    }
}
