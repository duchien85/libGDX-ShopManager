package com.gpteam.shopmanager.character;

import com.gpteam.shopmanager.game.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.deprecated.ErrorListener;
import com.gpteam.shopmanager.deprecated.error.Error;
import com.gpteam.shopmanager.deprecated.error.ErrorType;
import com.gpteam.shopmanager.player.Sex;
import com.gpteam.shopmanager.game.engine.modules.random_generator.RandGen;
import com.gpteam.shopmanager.game.engine.modules.text_handler.Text;

import static com.gpteam.shopmanager.variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public class CharacterInfo {
    private String name;
    private int age;
    private Sex sex;


    public CharacterInfo(String name, int age, Sex sex) {
        if (!validate(name, age, sex))
            ErrorHandler.handleIllegalArgumentException("One of the arguments was invalid. Found: name: "
                    + name + ", age: " + age + ", sex: " + sex.toString());
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
        if (!validate(name, age, sex))
            ErrorHandler.handleIllegalArgumentException("msg");
        assign(name, age, sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!validate(name))
            ErrorHandler.handleIllegalArgumentException(Text.ERROR_SET_NAME);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!validate(age))
            ErrorHandler.handleIllegalArgumentException(Text.ERROR_SET_AGE);
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getSexString() {
        return sex.toString();
    }

    public void setSex(Sex sex) {
        if (!validate(sex))
            ErrorHandler.handleIllegalArgumentException(Text.ERROR_SET_SEX);
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
        return name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH;
    }

    private boolean validate(int age) {
        return age < MIN_AGE_LENGTH || age > MAX_AGE_LENGTH;
    }

    private boolean validate(Sex sex) {
        return sex.equals(Sex.MALE) || sex.equals(Sex.FEMALE);
    }
}
