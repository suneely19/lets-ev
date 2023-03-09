package com.india.letsev.mapper;

import com.india.letsev.dto.AdminDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminMapper {

    public static PreparedStatement adminInsertMapper(PreparedStatement preparedStatement, AdminDto adminDto) throws SQLException {
        preparedStatement.setInt(1,adminDto.getId());
        preparedStatement.setString(2,adminDto.getName());
        preparedStatement.setString(3,adminDto.getMailid());
        preparedStatement.setString(4,adminDto.getAddress());
        preparedStatement.setString(5,adminDto.getMobile());
        preparedStatement.setInt(6,adminDto.getExperiance());
        preparedStatement.setDouble(7,adminDto.getSalary());


        return preparedStatement;
    }

    public static AdminDto populateAdminFromResultSetMapper(ResultSet resultSet) throws SQLException {
        AdminDto adminDto=new AdminDto();
        while (resultSet.next()){
            adminDto.setId(resultSet.getInt("id"));
            adminDto.setName(resultSet.getString("name"));
            adminDto.setMailid(resultSet.getString("mailid"));
            adminDto.setAddress(resultSet.getString("address"));
            adminDto.setMobile(resultSet.getString("mobile"));
            adminDto.setExperiance(resultSet.getInt("experiance"));
            adminDto.setSalary(resultSet.getDouble("salary"));
        }
        return adminDto;
    }

    public static List<AdminDto> populateAllAdminsFromResultSetMapper(ResultSet resultSet) throws SQLException {
        List<AdminDto> admins=new ArrayList<>();
        while (resultSet.next()){
            AdminDto adminDto=new AdminDto();
            adminDto.setId(resultSet.getInt("id"));
            adminDto.setName(resultSet.getString("name"));
            adminDto.setMailid(resultSet.getString("mailid"));
            adminDto.setAddress(resultSet.getString("address"));
            adminDto.setMobile(resultSet.getString("mobile"));
            adminDto.setExperiance(resultSet.getInt("experiance"));
            adminDto.setSalary(resultSet.getDouble("salary"));
            admins.add(adminDto);
        }
        return admins;
    }

    public static PreparedStatement adminUpdateMapper(PreparedStatement preparedStatement, AdminDto adminDto) throws SQLException {

        preparedStatement.setString(1,adminDto.getName());
        preparedStatement.setString(2,adminDto.getMailid());
        preparedStatement.setString(3,adminDto.getAddress());
        preparedStatement.setString(4,adminDto.getMobile());
        preparedStatement.setInt(5,adminDto.getExperiance());
        preparedStatement.setDouble(6,adminDto.getSalary());
        preparedStatement.setInt(7,adminDto.getId());


        return preparedStatement;
    }
}
