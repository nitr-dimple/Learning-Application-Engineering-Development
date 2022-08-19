/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dimple Patel
 */
public class VitalSigns {
    Integer id;
    float bloodPressure;
    Integer heartRate;
    float temperature;
    boolean isAbnormal;
    int count = 0;
    
    public VitalSigns() {
        count++;
        this.id = id;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(boolean isAbnormal) {
        this.isAbnormal = isAbnormal;
    }
    
    public void isPatientAbnormal(Patient p) {
        if(!(this.bloodPressure < 120.00 && this.bloodPressure > 90) || !(this.heartRate > 60 && this.heartRate < 100) || !(this.temperature >  97.8 && this.temperature < 99.1) ) {
            this.isAbnormal = true;
            p.setIsNormal(false);
        }else {
            this.isAbnormal = false;
             p.setIsNormal(true);
        }
    }
    
    @Override
    public String toString() {
        return id.toString();
    }
    
}
