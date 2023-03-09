package com.india.letsev.mapper;

import com.india.letsev.dto.UserDTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {
    public static PreparedStatement userInsertMapper(PreparedStatement preparedStatement, UserDTO userDTO) throws SQLException{
        preparedStatement.setInt(1,userDTO.getId());
        preparedStatement.setString(2, userDTO.getName());
        preparedStatement.setString(3, userDTO.getMailid());
        preparedStatement.setString(3, userDTO.getAddress());
        preparedStatement.setString(4, userDTO.getMobileno());
        preparedStatement.setString(5, userDTO.getMobileno());
        preparedStatement.setString(6, userDTO.getLicence());
        return preparedStatement;
    }

    public static UserDTO populateUserFromResultSetMapper(ResultSet resultSet) throws SQLException{
        UserDTO userDTO=new UserDTO();
        while(resultSet.next()) {
            userDTO.setId(resultSet.getInt("id"));
            userDTO.setName(resultSet.getString("name"));
            userDTO.setMailid(resultSet.getString("mailid"));
            userDTO.setAddress(resultSet.getString("address"));
            userDTO.setMobileno(resultSet.getString("mobileno"));
            userDTO.setLicence(resultSet.getString("licence"));
        }
        return userDTO;

    }




}
