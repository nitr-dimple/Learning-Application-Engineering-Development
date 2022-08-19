package carmanagement;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class ServiceRecord {
    private String date;
    private String description;
    private String mileage;
    private String cost;

    public ServiceRecord(String date, String description, String mileage, String cost) {
        this.date = date;
        this.description = description;
        this.mileage = mileage;
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
}
