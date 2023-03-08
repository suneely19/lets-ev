package com.india.letsev.mapper;

import com.india.letsev.dto.CarDTO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarMapper {

    public static PreparedStatement carInsertMapper(PreparedStatement preparedStatement, CarDTO carDTO) throws SQLException {
        preparedStatement.setInt(1,carDTO.getId());
        preparedStatement.setString(2,carDTO.getBrand());
        preparedStatement.setString(3,carDTO.getModel());
        preparedStatement.setString(4, carDTO.getColour());
        preparedStatement.setString(5,carDTO.getFeatures());
        preparedStatement.setInt(6,carDTO.getSeatingcapacity());
        preparedStatement.setString(7,carDTO.getFuelType());
        preparedStatement.setString(8,carDTO.getVeified());
        preparedStatement.setDouble(9,carDTO.getMilage());
        preparedStatement.setString(10,carDTO.getChasisno());
        preparedStatement.setString(11,carDTO.getRegistrationno());
        preparedStatement.setString(12,carDTO.getEngineno());
        preparedStatement.setInt(13,carDTO.getVerfiedAdminId());
        return preparedStatement;
    }
}
