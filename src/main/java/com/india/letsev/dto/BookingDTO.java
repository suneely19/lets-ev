package com.india.letsev.dto;

public class BookingDTO {
    private int id;
    private String user_id;
    private int car_id;
    private String Boarding;
    private String Destination;
    private int Duration;
    private double Amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getBoarding() {
        return Boarding;
    }

    public void setBoarding(String boarding) {
        Boarding = boarding;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", car_id=" + car_id +
                ", Boarding='" + Boarding + '\'' +
                ", Destination='" + Destination + '\'' +
                ", Duration=" + Duration +
                ", Amount=" + Amount +
                '}';
    }
}
