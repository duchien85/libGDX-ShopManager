package com.gpteam.shopmanager.Engine.Modules.Game_data;

import com.gpteam.shopmanager.Time.Date;

/*
 * Created by masmix on 23.12.2016.
 */
public class GameDate {
    private Date currentDate;
    private Date dateStarted;
    private Date realDateStarted;


    public GameDate() {
        currentDate = new Date();
        dateStarted = currentDate;
        realDateStarted = currentDate;
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
