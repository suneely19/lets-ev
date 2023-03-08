package com.india.letsev.dto;

public class AdminDto {
    private int id;
    private String name;
    private String mailid;
    private String address;
    private String mobile;
    private int experiance;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
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
                ", mobile='" + mobile + '\'' +
                ", experiance=" + experiance +
                ", salary=" + salary +
                '}';
    }
}
