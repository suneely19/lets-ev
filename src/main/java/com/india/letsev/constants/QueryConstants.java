package com.india.letsev.constants;

public class QueryConstants {

    public static final String CREATE_ADMIN_QUERY="create table admin(id int,name varchar(25),mailid varchar(35),address varchar(100),mobile varchar(13),experiance int,salary double)";
    public static final String CREATE_USER_QUERY="create table user(id int,name varchar(25),mailid varchar(35),address varchar(100),mobile varchar(13),licence varcahr(20))";
    public static final String INSERT_ADMIN_QUERY="insert into admin(id,name,mailid,address,mobile,experiance,salary) values(?,?,?,?,?,?,?)";
    public static final String INSERT_USER_QUERY="insert into user(id,name,mailid,address,mobile,licence) values(?,?,?,?,?,?)";
    public static final String UPDATE_ADMIN_QUERY="update admin set name=?, mailid=?,address=?,mobile=?,experiance=?,salary=? where id=?";
    public static final String UPDATE_USER_QUERY="update user set name=?, mailid=?, address=?, mobile=?, licence=? where id=?";
    public static final String DELETE_ADMIN_QUERY="delete admin where id=?";
    public static final String DELETE_USER_QUERY="delete user where id=?";



}
