package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountFactory {

    public static Account get() {
        Faker faker = new Faker();
        return Account.builder()
                .accountName(faker.name().username())
                .phone(faker.phoneNumber().phoneNumber())
                .website("tut.by")
                .employees("16")
                .billingCity(faker.address().city())
                .billingZipPostalCode(faker.address().zipCode())
                .billingStateProvince(faker.address().state())
                .billingCountry(faker.address().country())
                .shippingCity(faker.address().city())
                .shippingZipPostalCode(faker.address().zipCode())
                .shippingStateProvince(faker.address().state())
                .shippingCountry(faker.address().country())
                .type("Analyst")
                .industry("Banking")
                .description("Delivery only on weekdays")
                .billingStreet(faker.address().streetName())
                .shippingStreet(faker.address().streetName())

//                .parentAccount("TestTest")

                .build();
    }
}
