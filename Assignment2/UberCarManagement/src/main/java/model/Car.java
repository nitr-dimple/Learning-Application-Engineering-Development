package model;

import java.util.Random;

/**
 *
 * @author Dimple Patel
 */
public class Car {

    private Integer carId;
    private String model;
    private Integer manufacturingYear;
    private Integer noOfSeats;
    private String serialNo;
    private String city;
    private Integer maintenanceExpiryDate;
    private Integer distance;
    private boolean isAvailable;
    Random rand = new Random();

    private static Integer count = 0;
    /**
    * Car constructor
    */
    public Car() {
        count++;
        this.carId = count;
        this.distance = rand.nextInt(100);
    }
    /**
     * getter for car id
     * @return carId
     */

    public Integer getCarId() {
        return carId;
    }
    /**
     * setter for carId
     * @param carId 
     */

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
    
    /**
     * getter for model
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * setter for model
     * @param model 
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * getter for manufacturing year
     * @return manufacturingYear
     */
    public Integer getManufacturingYear() {
        return manufacturingYear;
    }

    /**
     * setter for manufacturingYear
     * @param manufacturingYear 
     */
    public void setManufacturingYear(Integer manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    /**
     * getter for no of seats
     * @return noOfSeats
     */
    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    /**
     * setter for no of seats
     * @param noOfSeats 
     */
    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    /**
     * getter for serial no
     * @return serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * setter of serialNo
     * @param serialNo 
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * get method for city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * set method for city
     * @param city 
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * get method for maintenanceExpiryDate
     * @return maintenanceExpiryDate
     */
    public Integer getMaintenanceExpiryDate() {
        return maintenanceExpiryDate;
    }

    /**
     * set method for maintenanceExpiryDate
     * @param maintenanceExpiryDate 
     */
    public void setMaintenanceExpiryDate(Integer maintenanceExpiryDate) {
        this.maintenanceExpiryDate = maintenanceExpiryDate;
    }

    /**
     * get method for isAvailable
     * @return isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * set method for isAvailable
     * @param isAvailable 
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * get method for count
     * @return count
     */
    public static Integer getCount() {
        return count;
    }

    /**
     * set method for count
     * @param count 
     */
    public static void setCount(Integer count) {
        Car.count = count;
    }

    /**
     * get method for distance
     * @return distance
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * set method for distance
     * @param distance 
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return model;
    }
}
