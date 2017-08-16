package com.gpteam.shopmanager.engine.modules.text_handler;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.needs.Needs;
import com.gpteam.shopmanager.player.Sex;
import com.gpteam.shopmanager.product.ProductView;
import com.gpteam.shopmanager.society.SocietyClass;
import com.gpteam.shopmanager.character.CharacterInfo;
import com.gpteam.shopmanager.skill.skills.Expertise;

/*
 * Created by masmix on 18.01.2017.
 */
public final class Text {
    private Text() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    /**
     * {@link Expertise}
     **************************************************/
    public static String expertise;
    public static String expertiseDescription;

    /**
     * {@link }
     **************************************************/
    public static String negotiation;
    public static String negotiationDescription;

    /**
     * {@link CharacterInfo}
     **************************************************/
    public static String workQuality;
    public static String workQualityDescription;
    public static String sex;
    public static String sexMale;
    public static String sexFemale;
    public static String ERROR_CONSTRUCTOR;
    public static String ERROR_CONSTRUCTOR_AGE;
    public static String ERROR_CONSTRUCTOR_SEX;
    public static String ERROR_CHARACTER_INFO;
    public static String ERROR_SET_NAME;
    public static String ERROR_SET_AGE;
    public static String ERROR_SET_SEX;
    public static String age;

    /**
     * {@link Sex}
     **************************************************/
    public static String male;
    public static String female;

    /**
     * {@link SocietyClass}
     **************************************************/
    public static String rich;
    public static String poor;
    public static String drunk;
    public static String middleclass;
    public static String teenager;
    public static String student;

    /**
     * {@link Needs}
     **************************************************/
    public static String ERROR_MESSAGE_1;

    /**
     * {@link ProductView}
     **************************************************/
    // Apple
    private static String appleName;
    private static String appleDescription;
    private static final String APPLE_SERIALNAME = "APPLE";
    public static final String[] APPLE = new String[] { appleName, appleDescription, APPLE_SERIALNAME };}
}



