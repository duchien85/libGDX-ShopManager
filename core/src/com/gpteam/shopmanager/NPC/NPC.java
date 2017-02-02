package com.gpteam.shopmanager.NPC;

import com.gpteam.shopmanager.Money.MoneyHandler;
import com.gpteam.shopmanager.Needs.NeedsHandler;
import com.gpteam.shopmanager.Society.SocietyHandler;

/*
 * Created by masmix on 26.01.2017.
 */
public class NPC {
    private NeedsHandler needsHandler;
    private MoneyHandler moneyHandler;
    private SocietyHandler societyHandler;

    public NPC() {
        needsHandler = new NeedsHandler();
        moneyHandler = new MoneyHandler();
        societyHandler = new SocietyHandler();
    }

    public NPC(boolean allRandom) {
        needsHandler = new NeedsHandler(allRandom);
        moneyHandler = new MoneyHandler();
        societyHandler = new SocietyHandler(allRandom);
    }

}
