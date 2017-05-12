package com.gpteam.shopmanager.Time;

import org.joda.time.DateTime;

import java.util.Date;

public final class Time implements Runnable {
    // liczenie czasu, metoda endOfDay()? ktora inkrementuje dzien do przodu
    private static int timeContainer[][][] = new int[23][59][59];
    private static DateTime date = new DateTime();

    @Override
    public void run() {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    if (i == 23 && j == 59 && k == 59) {
                        date.plusDays(1);
                        i = 0;
                        j = 0;
                        k = 0;
                    }
                    date.plusSeconds(1);
                    try { Thread.sleep(1000); }
                    catch (InterruptedException e) { e.printStackTrace(); }
                }
                date.plusMinutes(1);
            }
            date.plusHours(1);
        }
    }
}