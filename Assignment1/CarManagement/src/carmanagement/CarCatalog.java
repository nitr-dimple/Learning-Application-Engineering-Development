package carmanagement;

import java.util.ArrayList;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class CarCatalog {

    ArrayList<Car> cars;

    public CarCatalog()
    {
        cars = new ArrayList<>();
    }

    public void createNewCar(String brand, String model, String color, Integer year, Integer engineNumber, Integer numberOfSeats, String licencePlate, Integer warrantYear, byte photo[], String ownerName, Long telephoneNumber, String email, String driverLicence, String socialSecurityNumber, String address, ArrayList<ServiceRecord> serviceRecord)
    {
        OwnerDetails ownerDetails = new OwnerDetails(ownerName, telephoneNumber, email, driverLicence, socialSecurityNumber, address);
        CarDetails carDetails = new CarDetails(brand, model, year, color, engineNumber, numberOfSeats, licencePlate, warrantYear, photo);
        ServiceRecordList serviceRecordList = new ServiceRecordList(serviceRecord); 
        Car car = new Car(carDetails, ownerDetails, serviceRecordList);
        cars.add(car);
    }
    
    public ServiceRecord createNewServiceRecord(String date, String description, String mileage, String cost)
    {
        return new ServiceRecord(date, description, mileage, cost);
    }

}
