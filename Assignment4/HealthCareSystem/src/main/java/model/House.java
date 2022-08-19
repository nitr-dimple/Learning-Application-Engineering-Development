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
public class House {
    String houseId;
    ArrayList<Person> personList;
    
    public House() {
        this.personList = new ArrayList<Person>();
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public void addPerson(Person p) {
        personList.add(p);
    }
    
    public void removePerson(Person p) {
        personList.remove(p);
    }
    
    @Override
    public String toString() {
        return houseId;
    }
    
    
}
