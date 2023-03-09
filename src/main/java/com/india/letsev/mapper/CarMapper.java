package com.india.letsev.mapper;

import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.CarDTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class CarMapper {
    public static PreparedStatement carInsertMapper(PreparedStatement preparedStatement, CarDTO carDTO) throws SQLException {
        preparedStatement.setInt(1, carDTO.getId());
        preparedStatement.setString(2, carDTO.getBrand());
        preparedStatement.setString(3, carDTO.getModel());
        preparedStatement.setString(4, carDTO.getColour());
        preparedStatement.setString(5, carDTO.getFeatures());
        preparedStatement.setInt(6, carDTO.getSeatingcapacity());
        preparedStatement.setString(7, carDTO.getFuelType());
        preparedStatement.setString(8, carDTO.getVeified());
        preparedStatement.setDouble(9, carDTO.getMilage());
        preparedStatement.setString(10, carDTO.getChasisno());
        preparedStatement.setString(11, carDTO.getRegistrationno());
        preparedStatement.setString(12, carDTO.getEngineno());
        preparedStatement.setInt(13, carDTO.getVerfiedAdminId());
        return preparedStatement;
    }

    public static List<CarDTO> populateAllCarFromResultSetMapper(ResultSet resultSet) throws SQLException {
        List<CarDTO> Car = new ArrayList<>();
        while (resultSet.next()) {
            CarDTO CarDto = new CarDTO();
            CarDto.setId(resultSet.getInt("id"));
            CarDto.setBrand(resultSet.getString("Brand"));
            CarDto.setModel(resultSet.getString("Model"));
            CarDto.setColour(resultSet.getString("Colour"));
            CarDto.setFeatures(resultSet.getString("Features"));
            CarDto.setSeatingcapacity(resultSet.getInt("Seatingcapacity"));
            CarDto.setFuelType(resultSet.getString("FuelType"));
            CarDto.setVeified(resultSet.getString("veifed"));
            CarDto.setMilage(resultSet.getDouble("Milage"));
            CarDto.setChasisno(resultSet.getString("Chasisno"));
            CarDto.setRegistrationno(resultSet.getString("Registrationno"));
            CarDto.setEngineno(resultSet.getString("Engineno"));
            CarDto.setVerfiedAdminId(resultSet.getInt("VerfiedAdminId"));

            Car.add(CarDto);
        }
        return null;
    }

    public static PreparedStatement CarUpdateMapper(PreparedStatement preparedStatement, CarDTO carDTO) throws SQLException {
        preparedStatement.setInt(1, carDTO.getId());
        preparedStatement.setString(2, carDTO.getBrand());
        preparedStatement.setString(3, carDTO.getModel());
        preparedStatement.setString(4, carDTO.getColour());
        preparedStatement.setString(5, carDTO.getFeatures());
        preparedStatement.setInt(6, carDTO.getSeatingcapacity());
        preparedStatement.setString(7, carDTO.getFuelType());
        preparedStatement.setString(8, carDTO.getVeified());
        preparedStatement.setDouble(9, carDTO.getMilage());
        preparedStatement.setString(10, carDTO.getChasisno());
        preparedStatement.setString(11, carDTO.getRegistrationno());
        preparedStatement.setString(12, carDTO.getEngineno());
        preparedStatement.setInt(13, carDTO.getVerfiedAdminId());
        return preparedStatement;
    }

    public static CarDTO populateCarFromResultSetMapper(ResultSet resultSet) throws SQLException {
        CarDTO CarDto = new CarDTO();
        while (resultSet.next()) {
            CarDto.setId(resultSet.getInt("id"));
            CarDto.setBrand(resultSet.getString("Brand"));
            CarDto.setModel(resultSet.getString("Model"));
            CarDto.setColour(resultSet.getString("Colour"));
            CarDto.setFeatures(resultSet.getString("Features"));
            CarDto.setSeatingcapacity(resultSet.getInt("Seatingcapacity"));
            CarDto.setFuelType(resultSet.getString("FuelType"));
            CarDto.setVeified(resultSet.getString("veifed"));
            CarDto.setMilage(resultSet.getDouble("Milage"));
            CarDto.setChasisno(resultSet.getString("Chasisno"));
            CarDto.setRegistrationno(resultSet.getString("Registrationno"));
            CarDto.setEngineno(resultSet.getString("Engineno"));
            CarDto.setVerfiedAdminId(resultSet.getInt("VerfiedAdminId"));
        }
        return CarDto;

}
}