/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class City {
    String cityName;
    ArrayList<Community> communityList;
    
    public City() {
        this.communityList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public Community addCommunity() {
        Community c = new Community();
        communityList.add(c);
        return c;
    }
    
    @Override
    public String toString() {
        return cityName;
    }
    
}
