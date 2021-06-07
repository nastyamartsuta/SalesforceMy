package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contact {
    String salutation;
    String firstName;
    String middleName;
    String lastName;
    String suffix;
    String title;
    String email;
    String phone;
    String mobile;
    String department;
    String fax;
    String mailingAddress;
    String mailingCity;
    String mailingZipPostalCode;
    String mailingStateProvince;
    String mailingCountry;
    String mailingStreet;
    String accountName;
}
