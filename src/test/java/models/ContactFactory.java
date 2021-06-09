package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ContactFactory {

    public static Contact get() {
        Faker faker = new Faker();
        return Contact.builder()
                .salutation("Ms.")
                .firstName(faker.name().firstName())
                .middleName("-")
                .lastName(faker.name().lastName())
                .suffix("1233456")
                .title("contact")
                .email(faker.internet().emailAddress())
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().cellPhone())
                .department("contact")
                .fax(faker.phoneNumber().phoneNumber())
                .mailingAddress("contact")
                .mailingCity(faker.address().city())
                .mailingZipPostalCode(faker.address().zipCode())
                .mailingStateProvince(faker.address().state())
                .mailingCountry(faker.address().country())
                .mailingStreet(faker.address().streetName())
                .accountName("Nastya")
                .build();
    }
}
