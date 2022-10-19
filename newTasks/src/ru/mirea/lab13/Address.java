package ru.mirea.lab13;

import java.text.ParseException;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String campus;
    String flat;

    public Address(String address) {
        String[] words = address.split("[;,.]+");
        this.country = words[0];
        this.region = words[1];
        this.city = words[2];
        this.street = words[3];
        this.house = words[4];
        this.campus = words[5];
        this.flat = words[6];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", campus='" + campus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args) throws ParseException {
        Address address = new Address("Russia, Moscow Region, Moscow, Prospect Vernadskogo, 78, 1, A12");
        System.out.println(address.toString());
    }
}
