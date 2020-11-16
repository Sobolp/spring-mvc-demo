package com.example.springdemo.mvc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class Student {

    private String fistName;

    private String lastName;

    private String country;

//    private LinkedHashMap<String, String> countryOptions;
    final private Set<String> countryOptions = new HashSet<>(Arrays.asList("Brazil", "France", "Germany", "India", "USA"));

    private String favoriteLanguage;

    final private Set<String> lengOptions = new HashSet<>(Arrays.asList("Java", "C#", "PHP", "Ruby"));

    private String[] operatingSystems;

    final private Set<String> osOptions = new HashSet<>(Arrays.asList("Linux", "Mac OS", "MS Windows"));

    public Student() {
/*
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "USA");
*/
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

/*
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }
*/

    public Set<String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public Set<String> getLengOptions() {
        return lengOptions;
    }

    public Set<String> getOsOptions() {
        return osOptions;
    }
}
