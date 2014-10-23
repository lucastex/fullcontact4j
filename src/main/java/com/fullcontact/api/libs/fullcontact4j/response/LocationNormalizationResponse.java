package com.fullcontact.api.libs.fullcontact4j.response;

public class LocationNormalizationResponse extends FCResponse {

    private String city;
    private String county;
    private String continent;
    private double likelihood;
    private String normalizedLocation;
    private LocationCodeInfo state;
    private LocationCodeInfo country;

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getContinent() {
        return continent;
    }

    public double getLikelihood() {
        return likelihood;
    }

    public String getNormalizedLocation() {
        return normalizedLocation;
    }

    public LocationCodeInfo getState() {
        return state;
    }

    public LocationCodeInfo getCountry() {
        return country;
    }

    public static class LocationCodeInfo {
        private String name;
        private String code;

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }
    }

}
