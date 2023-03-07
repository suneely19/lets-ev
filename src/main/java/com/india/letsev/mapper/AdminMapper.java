package com.india.letsev.mapper;

import com.india.letsev.dto.AdminDto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminMapper {

    public static PreparedStatement AdminInsertMapper(PreparedStatement preparedStatement, AdminDto adminDto) throws SQLException {
        preparedStatement.setInt(1,adminDto.getId());
        preparedStatement.setString(2,adminDto.getName());
        preparedStatement.setString(3,adminDto.getMailid());
        preparedStatement.setString(4,adminDto.getAddress());
        preparedStatement.setString(5,adminDto.getMobile());
        preparedStatement.setInt(6,adminDto.getExperiance());
        preparedStatement.setDouble(7,adminDto.getSalary());


        return preparedStatement;
    }
}
