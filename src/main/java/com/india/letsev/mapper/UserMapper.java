package com.india.letsev.mapper;

import com.india.letsev.dto.UserDTO;

import java.sql.PreparedStatement;
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

}
