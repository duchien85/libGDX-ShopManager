package com.gpteam.shopmanager.Npc_builder.NPCBuilder;

import com.gpteam.shopmanager.Npc_builder.Needs.NeedsHandler;
import com.gpteam.shopmanager.Society.SocietyClassHandler;

/*
 * Created by masmix on 19.01.2017.
 */
public class NPCBuilder {
    NeedsHandler needs;
    SocietyClassHandler societyClassHandler;

    public NPCBuilder(NeedsHandler needs, SocietyClassHandler societyClassHandler) {
        this.needs = needs;
        this.societyClassHandler = societyClassHandler;
    }
}
