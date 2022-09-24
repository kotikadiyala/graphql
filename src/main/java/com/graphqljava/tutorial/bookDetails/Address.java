package com.graphqljava.tutorial.bookDetails;

import java.util.Arrays;
import java.util.List;

public class Address {

    private String id;
    private String addressLine1;
    private String addressLine2;
    private String townOrCity;
    private String county;
    private String postCode;

    public Address(String id, String addressLine1, String addressLine2, String townOrCity, String county, String postCode){
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.townOrCity = townOrCity;
        this.county = county;
        this.postCode = postCode;

    }

    public String getId() {
        return id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getTownOrCity() {
        return townOrCity;
    }

    public String getCounty() {
        return county;
    }

    public String getPostCode() {
        return postCode;
    }

    private static List<Address> auddresses = Arrays.asList(
            new Address("address-1", "10", "StewartClose", "HayWards Heath", "West Sussex", "RH16 4ZQ"),
            new Address("address-2", "8", "StewartClose", "HayWards Heath", "West Sussex", "RH16 4ZQ"),
            new Address("address-3", "6", "StewartClose", "HayWards Heath", "West Sussex", "RH16 4ZQ")
    );

    public static Address getById(String id) {
        return auddresses.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }
}
