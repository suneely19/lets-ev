package com.india.letsev.dto;

public class CarDTO {
   private int id;
   private String brand;
   private String model;
   private String colour;
   private String features;
   private int seatingcapacity;
   private String fuelType;
   private String veified;
   private double milage;
   private String chasisno;
   private String registrationno;
   private String engineno;
   private int verfiedAdminId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getSeatingcapacity() {
        return seatingcapacity;
    }

    public void setSeatingcapacity(int seatingcapacity) {
        this.seatingcapacity = seatingcapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getVeified() {
        return veified;
    }

    public void setVeified(String veified) {
        this.veified = veified;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }

    public String getChasisno() {
        return chasisno;
    }

    public void setChasisno(String chasisno) {
        this.chasisno = chasisno;
    }

    public String getRegistrationno() {
        return registrationno;
    }

    public void setRegistrationno(String registrationno) {
        this.registrationno = registrationno;
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno;
    }

    public int getVerfiedAdminId() {
        return verfiedAdminId;
    }

    public void setVerfiedAdminId(int verfiedAdminId) {
        this.verfiedAdminId = verfiedAdminId;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", features='" + features + '\'' +
                ", seatingcapacity=" + seatingcapacity +
                ", fuelType='" + fuelType + '\'' +
                ", veified='" + veified + '\'' +
                ", milage=" + milage +
                ", chasisno='" + chasisno + '\'' +
                ", registrationno='" + registrationno + '\'' +
                ", engineno='" + engineno + '\'' +
                ", verfiedAdminId=" + verfiedAdminId +
                '}';
    }
}
