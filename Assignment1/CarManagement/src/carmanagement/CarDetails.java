package carmanagement;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class CarDetails {
    private String brand;
    private String model;
    private Integer year;
    private String color;
    private Integer engineNumber;
    private Integer numberOfSeats;
    private String licencePlate;
    private Integer warrantyYear;
    private byte photo[];

    public CarDetails(String brand, String model, Integer year, String color, Integer engineNumber, Integer numberOfSeats, String licencePlate, Integer warrantyYear, byte photo[]) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineNumber = engineNumber;
        this.numberOfSeats = numberOfSeats;
        this.licencePlate = licencePlate;
        this.warrantyYear = warrantyYear;
        this.photo = photo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(Integer engineNumber) {
        this.engineNumber = engineNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public Integer getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(Integer warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

}
