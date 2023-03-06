package com.india.letsev.constants;

public class QueryConstants {

    public static final String CREATE_ADMIN_QUERY="create table admin(id int,name varchar(25),mailid varchar(35),address varchar(100),mobile varchar(13),experiance int,salary double)";
    public static final String CREATE_USER_QUERY="create table user(id int,name varchar(25),mailid varchar(35),address varchar(100),mobile varchar(13),licence varcahr(20))";
    public static final String CREATE_BOOKING_QUERY="create table booking(id int,user_id varchar(40),car_id int,boarding varchar(30),destination varchar(30),duration int,amount double)";
    public static final String INSERT_ADMIN_QUERY="insert into admin(id,name,mailid,address,mobile,experiance,salary) values(?,?,?,?,?,?,?)";
    public static final String INSERT_BOOKING_QUERY="insert into booking(id,user_id,car_id,boarding,destination,duration,amount) values(?,?,?,?,?,?,?)";
    public static final String UPDATE_ADMIN_QUERY="update admin set name=?, mailid=?,address=?,mobile=?,experiance=?,salary=? where id=?";
    public static final String UPDATE_BOOKING_QUERY="update booking set user_id=?,car_id=?,boarding=?,destination=?,duration=?,amount=? where id=?";
    public static final String DELETE_ADMIN_QUERY="delete admin where id=?";
    public static final String DELETE_BOOKING_QUERY="delete booking where id=?";



}
