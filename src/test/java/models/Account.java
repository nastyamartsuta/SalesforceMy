package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    String accountName;
    String phone;
    String website;
    String employees;
    String billingCity;
    String billingZipPostalCode;
    String billingStateProvince;
    String billingCountry;
    String shippingCity;
    String shippingZipPostalCode;
    String shippingStateProvince;
    String shippingCountry;
    String type;
    String industry;
    String description;
    String billingStreet;
    String shippingStreet;
}

