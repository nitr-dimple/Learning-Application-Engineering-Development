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
public class EncounterHistory {
    Integer id;
    ArrayList<Encounter> encounterList;
    int count = 0;
    
    public EncounterHistory() {
        count++;
        this.id = count;
        encounterList = new ArrayList<Encounter>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public Encounter addEncounter() {
        Encounter e = new Encounter();
        this.encounterList.add(e);
        return e;
    }
    
}
