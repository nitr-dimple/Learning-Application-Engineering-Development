package carmanagement;

/**
 * @author Dimpleben Kanjibhai Patel
 */

public class OwnerDetails {
    private String name;
    private Long telephoneNumber;
    private String email;
    private String driverLicence;
    private String socialSecurityNumber;
    private String address;

    public OwnerDetails(String name, Long telephoneNumber, String email, String driverLicence, String socialSecurityNumber, String address) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.driverLicence = driverLicence;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(Long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
