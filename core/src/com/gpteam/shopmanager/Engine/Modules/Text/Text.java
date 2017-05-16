package com.gpteam.shopmanager.Engine.Modules.Text;

import com.gpteam.shopmanager.Needs.Needs;
import com.gpteam.shopmanager.Product.ProductView;
import com.gpteam.shopmanager.Society.SocietyClass;
import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.Skill.Skills.Expertise;

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
    public static String appleName;
    public static String appleDescription;
}
