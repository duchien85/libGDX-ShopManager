package com.gpteam.shopmanager.Variables;

import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.Deprecated.NamesLoader;
import com.gpteam.shopmanager.NPC.NPCHandler;
import com.gpteam.shopmanager.Needs.Needs;
import com.gpteam.shopmanager.Product.Product;
import com.gpteam.shopmanager.Skill.SkillLogic;
import com.gpteam.shopmanager.Deprecated.Traffic.TrafficHandler;
import com.gpteam.shopmanager.Time.Time;

/*
 * Created by masmix on 04.02.2017.
 */
public final class Variables {
    /**************************************************
     * {@link NamesLoader}
     * NAMES_PATH - location of file with random names
     **************************************************/
    public final static String NAMES_PATH = "names.txt";

    /**************************************************
     * {@link CharacterInfo}
     **************************************************/
    public final static int MAX_NAME_LENGTH = 25;
    public final static int MIN_NAME_LENGTH = 2;
    public final static int MAX_AGE_LENGTH = 120;
    public final static int MIN_AGE_LENGTH = 16;

    /**************************************************
     * {@link SkillLogic}
     **************************************************/
    public final static int MAX_SKILL_LEVEL = 120;
    public final static int MIN_SKILL_LEVEL = 0;

    /**************************************************
     * {@link NPCHandler}
     **************************************************/
    public final static int MAX_NPC_AMOUNT = 10000;
    public final static int MIN_NPC_AMOUNT = 0;

    /**************************************************
     * {@link TrafficHandler}
     **************************************************/
    public final static int MAX_TRAFFIC_LOAD = 100;
    public final static int MIN_TRAFFIC_LOAD = 0;

    /**************************************************
     * {@link Time}
     * DELAY - time between time incrementation
     * in milliseconds (1 second = 1000 milliseconds)
     * SECONDS - amount of seconds in a minute
     **************************************************/
    public final static int DELAY = 500;
    public final static int SECONDS = 10;

    /**************************************************
     * {@link Needs}
     **************************************************/
    public final static int MIN_NEED_VALUE = 0;
    public final static int MAX_NEED_VALUE = 100;

    /**************************************************
     * {@link Product}
     **************************************************/
    public static final int MAX_QUANTITY = 1000000;
    public static final int MIN_QUANTITY = 0;
}
