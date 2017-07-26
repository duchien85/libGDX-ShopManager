package com.gpteam.shopmanager.advertising.sources.newspaper;

import com.gpteam.shopmanager.advertising.sources.AdSource;
import com.gpteam.shopmanager.society.SocietyClass;

public class Newspaper implements AdSource {
    @Override
    public void increaseFunds() {
    }

    @Override
    public int getSocietyClassEffectivnes(SocietyClass societyClass) {
        return 0;
    }

    @Override
    public void getAdEffectivnes() {
    }
}
