package com.gpteam.shopmanager.character;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.error_handler.ErrorListener;
import com.gpteam.shopmanager.engine.modules.error_handler.error.Error;
import com.gpteam.shopmanager.engine.modules.error_handler.error.ErrorType;
import com.gpteam.shopmanager.player.Sex;
import com.gpteam.shopmanager.engine.modules.random_generator.RandGen;
import com.gpteam.shopmanager.engine.modules.text_handler.Text;

import static com.gpteam.shopmanager.variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public class CharacterInfo {
    private String name;
    private int age;
    private Sex sex;
    private String errorMessage;

    public CharacterInfo(String name, int age, Sex sex) {
        if (!validate(name, age, sex)) {
            errorMessage = "One of the arguments was invalid. Found: name: " + name + ", age: " + age + ", sex: " + sex.toString();
            ErrorListener.notify(new Error(this.getClass().getSimpleName(), errorMessage, ErrorType.INVALID_CHAR_INFO));
            ErrorHandler.handleIllegalArgumentException(errorMessage);
        }
            assign(name, age, sex);
    }

    public CharacterInfo() {
        initialize();
    }

    @Override
    public String toString() {
        if (sex.equals(Sex.MALE))
            return name + ", " + age + " " + Text.age + ", " + Text.male;
        else
            return name + ", " + age + " " + Text.age + ", " + Text.female;
    }

    public void setCharacterInfo(String name, int age, Sex sex) {
        if (!validate(name, age, sex)) {
            errorMessage = "";
            ErrorListener.notify(new Error(this.getClass().getSimpleName(), errorMessage, ErrorType.INVALID_CHAR_INFO));
            ErrorHandler.handleIllegalArgumentException(errorMessage);
        }
        assign(name, age, sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!validate(name)) {
            errorMessage = Text.ERROR_SET_NAME;
            ErrorListener.notify(new Error(this.getClass().getSimpleName(), errorMessage, ErrorType.INVALID_NAME));
            ErrorHandler.handleIllegalArgumentException(errorMessage);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!validate(age)) {
            errorMessage = Text.ERROR_SET_AGE;
            ErrorListener.notify(new Error(this.getClass().getSimpleName(), errorMessage, ErrorType.INVALID_AGE));
            ErrorHandler.handleIllegalArgumentException(errorMessage);
        }
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getSexString() {
        return sex.toString();
    }

    public void setSex(Sex sex) {
        if (validate(sex)) {
            errorMessage = Text.ERROR_SET_SEX;
            ErrorListener.notify(new Error(this.getClass().getSimpleName(), errorMessage, ErrorType.INVALID_SEX));
            ErrorHandler.handleIllegalArgumentException(errorMessage);
        }
        this.sex = sex;
    }

    private void initialize() {
        name = RandGen.getRandomName();
        age = RandGen.getRandomAge();
        sex = RandGen.getRandomSex();
    }

    private void assign(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private boolean validate(String name, int age, Sex sex) {
        return validate(name) && validate(age) && validate(sex);
    }

    private boolean validate(String name) {
        return name.length() <= MAX_NAME_LENGTH && name.length() >= MIN_NAME_LENGTH;
    }

    private boolean validate(int age) {
        return age <= MAX_AGE_LENGTH && age >= MIN_AGE_LENGTH;
    }

    private boolean validate(Sex sex) {
        return sex.equals(Sex.MALE) || sex.equals(Sex.FEMALE);
    }
}
