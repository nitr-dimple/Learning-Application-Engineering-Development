package model;

import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class CarCatalog {

    private ArrayList<Car> carCatalog;

    /**
     * CarCatalog constructor
     */
    public CarCatalog() {
        this.carCatalog = new ArrayList<Car>();
    }

    /**
     * set method for carCatalog
     * @param carCatalog 
     */
    public void setCarCatalog(ArrayList<Car> carCatalog) {
        this.carCatalog = carCatalog;
    }
    
    /**
     * get method for catCatalog
     * @return 
     */
    public ArrayList<Car> getCarCatalog() {
        return carCatalog;
    }

    /**
     * add new car
     * @return Car object
     */
    public Car addCar() {
        Car car = new Car();
        this.carCatalog.add(car);
        return car;
    }
}
