package Geo.model;

import java.util.ArrayList;

public class eastAsiaCountries {
    protected String countryCode;
    protected String countryName;
    protected double countryArea;

    public eastAsiaCountries() {
    }

    public eastAsiaCountries(String countryCode, String countryName, double countryArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryArea = countryArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea = countryArea;
    }

    public void display() {

    }

    public static void printCountry(ArrayList<Country> lc) {
    }

    public static void searchByName(ArrayList<Country> lc) {
    }

    public static void printCountrySorted(ArrayList<Country> lc) {
    }
}
