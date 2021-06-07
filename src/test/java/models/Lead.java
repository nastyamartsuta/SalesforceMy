package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Lead {

    String leadStatus;
    String salutation;
    String rating;
    String industry;
    String leadSource;
    String website;
    String firstName;
    String middleName;
    String lastName;
    String suffix;
    String title;
    String email;
    String phone;
    String mobile;
    String company;
    String noOfEmployees;
    String address;
    String city;
    String zipPostalCode;
    String stateProvince;
    String country;
    String street;
}
