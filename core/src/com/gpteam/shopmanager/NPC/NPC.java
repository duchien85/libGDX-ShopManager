package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.Money.MoneyHandler;
import com.gpteam.shopmanager.Npc_builder.Needs.NeedsHandler;
import com.gpteam.shopmanager.Society.SocietyClassHandler;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPC {
    private NeedsHandler needsHandler;
    private MoneyHandler moneyHandler;
    private SocietyClassHandler societyClassHandler;

    public NPC() {
        needsHandler = new NeedsHandler();
        moneyHandler = new MoneyHandler();
        societyClassHandler = new SocietyClassHandler();
    }
}
