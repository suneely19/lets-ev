package com.india.letsev.dto;

public class UserDTO {
    private int id;
    private String name;
    private  String mailid;
    private String address;
    private String mobileno;
    private String licence;

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

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mailid='" + mailid + '\'' +
                ", address='" + address + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", licence='" + licence + '\'' +
                '}';
    }
}
