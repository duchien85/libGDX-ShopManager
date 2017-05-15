package com.gpteam.shopmanager.Time;

import com.gpteam.shopmanager.Variables.Variables;

public class Time implements Runnable {
    private Date date;

    @Override
    public void run() {
        date = new Date();
        for (int i = 1; i <= 23; i++) {
            for (int j = 1; j <= 59; j++) {
                for (int k = 1; k <= Variables.SECONDS; k++) {
                    if (i == 23 && j == 59 && k == Variables.SECONDS) {
                        date.plusDays(1);
                        i = 0;
                        j = 0;
                        k = 0;
                    }
                    date.plusSeconds(1);
                    try { Thread.sleep(Variables.DELAY); }
                    catch (InterruptedException e) { e.printStackTrace(); }
                }
                date.plusMinutes(1);
            }
            date.plusHours(1);
        }
    }

    public void initialize() {
    } // TODO Add start date
}