package ru.mirea.lab30;


public final class Address {
    private final String cityName, streetName;
    private final int zipCode, buildNum, apartmentNum;
    private final char buildLetter;
    public static final Address EMPTY_ADDRESS = new Address("", 0, "", 0, 0);

    public Address(String cityName, int zipCode, String streetName, int buildNum, int apartmentNum, char buildCorp) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.apartmentNum = apartmentNum;
        this.buildNum = buildNum;
        this.buildLetter = buildCorp;
    }
    public Address(String cityName,int zipCode, String streetName, int buildNum, int apartmentNum){
        this(cityName, zipCode, streetName, buildNum, apartmentNum, ' ');
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public int getBuildNum() {
        return buildNum;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public char getBuildLetter(){
        return buildLetter;
    }
}