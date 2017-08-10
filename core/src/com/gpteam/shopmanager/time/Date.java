package com.gpteam.shopmanager.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by masmix on 14.05.2017.<p>
 * {@code GregorianCalendar} wrapper class. Main difference from {@code GregorianCalendar}
 * is that this class starts counting {@code Calendar.MONTH} from 1, instead of 0 to 12, instead of 11.
 */
public class Date {
    private Calendar calendar;

    /**
     * Constructs a default {@code Date} ({@code GregorianCalendar} using current time and date.
     */
    public Date() {
        calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, Calendar.MONTH + 1);
    }

    /**
     *
     * @param day 1 - 31
     */
    public Date(int day) {
        calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_MONTH, day);
    }

    /**
     * Month argument starts at 1 (January) and ends at 12(December)
     * @param day
     * @param month 1 - 12
     */
    public Date (int day, int month) {
        calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1);
    }

    /**
     * YYYY.MM.DDDD
     * @param year XXXX
     * @param month 1 - 12
     * @param day 1 - 31
     */
    public Date(int year, int month, int day) {
        calendar = new GregorianCalendar(year, month - 1, day);
    }

    public boolean equals(Date otherDate) {
        return getYear() == otherDate.getYear() && getMonth() == otherDate.getMonth() && getDay() == otherDate.getDay();
    }

    public boolean equalsYear(int year) {
        return getYear() == year;
    }

    public boolean equalsMonth(int month) {
        return getMonth() == month;
    }

    public boolean equalsDay(int day) {
        return getDay() == day;
    }

    @Override
    public String toString() {
        return calendar.get(Calendar.DAY_OF_MONTH) + "." + calendar.get(Calendar.MONTH + 1) + "." + calendar.get(Calendar.YEAR);
    }

    public long getTime() {
        return calendar.getTimeInMillis();
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

    public int getHour() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }

    public int getSecond() {
        return calendar.get(Calendar.SECOND);
    }

    public void plusSeconds(int seconds) {
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) + seconds);
    }

    public void plusMinutes(int minutes) {
        calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) + minutes);
    }

    public void plusHours(int hours) {
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) + hours);
    }

    public void plusDays(int days) {
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + days);
    }
}
