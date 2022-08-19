/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Dimple Patel
 */
public class Encounter {
    Integer id;
    Date date;
    VitalSigns vitalSigns;
    int count = 0;
    
    public Encounter() {
        count++;
        this.id = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public VitalSigns createVitalSign() {
        vitalSigns = new VitalSigns();
        return this.vitalSigns;
    }
    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
}
