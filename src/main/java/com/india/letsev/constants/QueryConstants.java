package com.india.letsev.constants;

public class QueryConstants {

    public static final String CREATE_ADMIN_QUERY="create table admin(id int,name varchar(25),mailid varchar(35),address varchar(100),mobile varchar(13),experiance int,salary double)";
    public static final String CREATE_USER_QUERY="create table user(id int,name varchar(25),mailid varchar(35),address varchar(100),mobile varchar(13),licence varcahr(20))";
    public static final String INSERT_ADMIN_QUERY="insert into admin(id,name,mailid,address,mobile,experiance,salary) values(?,?,?,?,?,?,?)";
    public static final String UPDATE_ADMIN_QUERY="update admin set name=?, mailid=?,address=?,mobile=?,experiance=?,salary=? where id=?";
    public static final String DELETE_ADMIN_QUERY="delete admin where id=?";
    public static final String CREATE_CAR_QUERY="create car(id int,brand varchar(25),model varchar(30),colour varchar(30),features varchar(50),seating_capacity int,fuel_type varchar(30),verified varchar(30),milage double,chasis_no varchar(30),registration_no varchar(30),engine_no varchar(30),verified_admin_id int) ";
    public static final String INSERT_CAR_QUERY="insert into car(id,brand,model,colour,features,seating_capacity,fuel_type,verified,milage,chasis_no,registration_no,engine_no,verified_admin_id) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";


    public static final String UPDATE_CAR_QUERY="update car  set brand=?, model=? , colour=? , features=? , seating_capacity=? ,fuel_type=?,verified=?,milage=?,chasis_no=?,registration_no=?,engine_no=?,verified_admin_id=? where id=?";

    public static final String DELETE_CAR_QUERY="delete car where id=?";
}
