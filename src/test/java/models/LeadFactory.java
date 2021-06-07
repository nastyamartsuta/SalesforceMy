package models;

import com.github.javafaker.Faker;

public class LeadFactory {
    public static Lead get() {
        Faker faker = new Faker();
        return Lead.builder()
                .leadStatus("New")
                .salutation("Ms.")
                .rating("Hot")
                .industry("Banking")
                .leadSource("Employee Referral")
                .website(faker.internet().domainName())
                .firstName(faker.name().firstName())
                .middleName("-")
                .lastName(faker.name().lastName())
                .suffix("1233456")
                .title("contact")
                .email(faker.internet().emailAddress())
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().cellPhone())
                .company(faker.company().name())
                .noOfEmployees("500")
                .address("lead")
                .city(faker.address().city())
                .zipPostalCode(faker.address().zipCode())
                .stateProvince(faker.address().state())
                .country(faker.address().country())
                .street(faker.address().streetName())
                .build();
    }
}

