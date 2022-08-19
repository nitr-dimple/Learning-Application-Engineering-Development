package model;

/**
 *
 * @author Dimple Patel
 */
public class Supplier {

    private Integer manufacturerId;
    private String supplyName;
    private String email;
    private Long phoneNo;
    private static Integer count = 0;

    private CarCatalog carCatalog;

    /**
     * Supplier constructor
     */
    public Supplier() {
        count++;
        this.manufacturerId = count;
        carCatalog = new CarCatalog();
    }

    /**
     * get method for email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * set method for email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get method for phone no
     * @return phoneNo
     */
    public Long getPhoneNo() {
        return phoneNo;
    }

    /**
     * set method for phoneNo
     * @param phoneNo 
     */
    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * get method for supplyName
     * @return supplyName
     */
    public String getSupplyName() {
        return supplyName;
    }

    /**
     * set method for supplyName
     * @param supplyName 
     */
    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    /**
     * get method for carCatalog
     * @return carCatalog
     */
    public CarCatalog getCarCatalog() {
        return carCatalog;
    }

    /**
     * set method for carCatalog
     * @param carCatalog 
     */
    public void setCarCatalog(CarCatalog carCatalog) {
        this.carCatalog = carCatalog;
    }

    /**
     * get method for manufacturerId
     * @return manufacturerId
     */
    public Integer getManufacturerId() {
        return manufacturerId;
    }

    @Override
    public String toString() {
        return supplyName;
    }
}
