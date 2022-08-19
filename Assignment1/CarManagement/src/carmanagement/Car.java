package carmanagement;

/**
 * @author Dimpleben Kanjibhai Patel
 */

public class Car {
    private CarDetails carDetails;
    private OwnerDetails ownerDetails;
    private ServiceRecordList serviceRecordList;

    public Car(CarDetails carDetails, OwnerDetails ownerDetails, ServiceRecordList serviceRecordList) {
        this.carDetails = carDetails;
        this.ownerDetails = ownerDetails;
        this.serviceRecordList = serviceRecordList;
    }

    public CarDetails getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(CarDetails carDetails) {
        this.carDetails = carDetails;
    }

    public OwnerDetails getOwnerDetails() {
        return ownerDetails;
    }

    public void setOwnerDetails(OwnerDetails ownerDetails) {
        this.ownerDetails = ownerDetails;
    }

    public ServiceRecordList getServiceRecordList() {
        return serviceRecordList;
    }

    public void setServiceRecordList(ServiceRecordList serviceRecordList) {
        this.serviceRecordList = serviceRecordList;
    }

    
}
