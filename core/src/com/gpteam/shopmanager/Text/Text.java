package com.gpteam.shopmanager.Text;

import com.gpteam.shopmanager.Traffic.TrafficHandler;
import com.gpteam.shopmanager.Society.SocietyClass;
import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.Variables.Variables;
import com.gpteam.shopmanager.Skill.Skills.Expertise;

/*
 * Created by masmix on 18.01.2017.
 */
public final class Text {
    /**************************************************
     * {@link Expertise}
     **************************************************/
    public static String expertise;
    public static String expertiseDescription;


    /**************************************************
     * {@link }
     **************************************************/
    public static String negotiation;
    public static String negotiationDescription;


    /**************************************************
     * {@link CharacterInfo}
     **************************************************/
    public static String workQuality;
    public static String workQualityDescription;


    /**************************************************
     * {@link CharacterInfo}
     **************************************************/
    public static String sex;
    public static String sexMale;
    public static String sexFemale;


    /**************************************************
     * {@link SocietyClass}
     **************************************************/
    public static String rich;
    public static String poor;
    public static String drunk;
    public static String middleclass;
    public static String teenager;
    public static String student;


    /**************************************************
     * {@link TrafficHandler}
     **************************************************/
    public static final String VALIDATE_TRAFFIC_LOAD_EXCEPTION = "Traffic load must be between " + Variables.MIN_TRAFFIC_LOAD + " and " + Variables.MAX_TRAFFIC_LOAD + ". ";
}
