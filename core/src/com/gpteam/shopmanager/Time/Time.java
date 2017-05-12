package com.gpteam.shopmanager.Time;

import java.util.Date;

public final class Time implements Runnable {
    // liczenie czasu, metoda endOfDay()? ktora inkrementuje dzien do przodu
    private static int timeContainer[][][] = new int[23][59][59];
    private static Date date;

    @Override
    public void run() {
    }
}