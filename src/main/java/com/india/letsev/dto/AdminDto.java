package com.india.letsev.dto;

public class AdminDto {


private int id;
private String name;
private String mailid;
private String address;
private  int mobile;
private int experience;
private double salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "AdminDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mailid='" + mailid + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
