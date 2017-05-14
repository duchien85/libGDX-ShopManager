package com.gpteam.shopmanager.Time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Created by masmix on 14.05.2017.
 */
public class Date {
    private Calendar calendar;

    /**
     *
     * @param year
     * @param month 1 - 12
     * @param day
     */
    public Date(int year, int month, int day) {
        calendar = new GregorianCalendar(year, month, day);
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public void setYear(int year) {
        calendar.set(Calendar.YEAR, year);
    }

    public int getMonth() {
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     *
     * @param month 1 - 12
     */
    public void setMonth(int month) {
        calendar.set(Calendar.MONTH, month - 1);
    }

    public int getDay() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public void setDay(int day) {
        calendar.set(Calendar.DAY_OF_MONTH, day);
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
