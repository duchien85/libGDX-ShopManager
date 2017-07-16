package com.gpteam.shopmanager.city;

import com.gpteam.shopmanager.city.district.District;

/*
 * Created by masmix on 02.02.2017.
 */
public class City {
    private String name;
    private int population;
    private District[] districts;

    // TODO figure out how to handle assigning npcs
    // to individual areas of the city

    public City(String name, boolean initialize, String... districts) {
        this.name = name;
        this.districts = new District[districts.length];

        for (int i = 0; i < districts.length; i++)
            this.districts[i] = new District(districts[i]);

        if (initialize) {
            for (int i = 0; i < this.districts.length; i++) {
                this.districts[i].
            }
        }
    }
}