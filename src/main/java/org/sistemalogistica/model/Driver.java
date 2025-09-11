package org.sistemalogistica.model;

public class Driver {

    private String name;
    private String cnh;
    private String vehicle;
    private String baseCity;

    public Driver(String name, String cnh, String vehicle, String baseCity) {
        this.name = name;
        this.cnh = cnh;
        this.vehicle = vehicle;
        this.baseCity = baseCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getBaseCity() {
        return baseCity;
    }

    public void setBaseCity(String baseCity) {
        this.baseCity = baseCity;
    }
}
