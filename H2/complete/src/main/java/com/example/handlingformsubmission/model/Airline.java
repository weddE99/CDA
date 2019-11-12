package com.example.handlingformsubmission.model;

public class Airline {
    String airlineNameShort;
    String airlineNameLong;
    Double basicRate;
    Double distanceDiscount;
    Double businessLevelFactor;
    Double firstClassLEvelFactor;
    Integer economySeat;
    Integer firstClassSeat;

    public String getAirlineNameShort() {
        return airlineNameShort;
    }

    public void setAirlineNameShort(String airlineNameShort) {
        this.airlineNameShort = airlineNameShort;
    }

    public String getAirlineNameLong() {
        return airlineNameLong;
    }

    public void setAirlineNameLong(String airlineNameLong) {
        this.airlineNameLong = airlineNameLong;
    }

    public Double getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(Double basicRate) {
        this.basicRate = basicRate;
    }

    public Double getDistanceDiscount() {
        return distanceDiscount;
    }

    public void setDistanceDiscount(Double distanceDiscount) {
        this.distanceDiscount = distanceDiscount;
    }

    public Double getBusinessLevelFactor() {
        return businessLevelFactor;
    }

    public void setBusinessLevelFactor(Double businessLevelFactor) {
        this.businessLevelFactor = businessLevelFactor;
    }

    public Double getFirstClassLEvelFactor() {
        return firstClassLEvelFactor;
    }

    public void setFirstClassLEvelFactor(Double firstClassLEvelFactor) {
        this.firstClassLEvelFactor = firstClassLEvelFactor;
    }

    public Integer getEconomySeat() {
        return economySeat;
    }

    public void setEconomySeat(Integer economySeat) {
        this.economySeat = economySeat;
    }

    public Integer getFirstClassSeat() {
        return firstClassSeat;
    }

    public void setFirstClassSeat(Integer firstClassSeat) {
        this.firstClassSeat = firstClassSeat;
    }
}
