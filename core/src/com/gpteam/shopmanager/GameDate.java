package com.gpteam.shopmanager;

import java.util.Date;

/*
 * Created by masmix on 23.12.2016.
 */
public class GameDate {
    private Date currentDate;
    private Date dateStarted;


    public GameDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public void initDate() {
        dateStarted = new Date();
    }

    public Date getDateStarted() {
        return dateStarted;
    }
}
