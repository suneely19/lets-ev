package com.india.letsev.mapper;

import com.india.letsev.dto.CarDTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static CarDTO populateCarFromResultSetMapper(ResultSet resultSet) throws SQLException{
        CarDTO carDTO= new CarDTO();
        while (resultSet.next()){
            carDTO.setId(resultSet.getInt("id"));
            carDTO.setBrand(resultSet.getString("brand"));
            carDTO.setModel(resultSet.getString("model"));
            carDTO.setColour(resultSet.getString("colour"));
            carDTO.setFeatures(resultSet.getString("features"));
            carDTO.setSeatingcapacity(resultSet.getInt("seating_capacity"));
            carDTO.setFuelType(resultSet.getString("fuel_type"));
            carDTO.setVeified(resultSet.getString("verified"));
            carDTO.setMilage(resultSet.getDouble("milage"));
            carDTO.setChasisno(resultSet.getString("chasis_no"));
            carDTO.setRegistrationno(resultSet.getString("registration_no"));
            carDTO.setEngineno(resultSet.getString("engine_no"));
            carDTO.setVerfiedAdminId(resultSet.getInt("verified_admin_id"));

        }
        return carDTO;
    }

    public static List<CarDTO> populateAllCarsFromResultSetMapper(ResultSet resultSet) throws SQLException{
        List<CarDTO> cars=new ArrayList<>();
        while (resultSet.next()){
            CarDTO carDTO=new CarDTO();
            carDTO.setId(resultSet.getInt("id"));
            carDTO.setBrand(resultSet.getString("brand"));
            carDTO.setModel(resultSet.getString("model"));
            carDTO.setColour(resultSet.getString("colour"));
            carDTO.setFeatures(resultSet.getString("features"));
            carDTO.setSeatingcapacity(resultSet.getInt("seating_capacity"));
            carDTO.setFuelType(resultSet.getString("fuel_type"));
            carDTO.setVeified(resultSet.getString("verified"));
            carDTO.setMilage(resultSet.getDouble("milage"));
            carDTO.setChasisno(resultSet.getString("chasis_no"));
            carDTO.setRegistrationno(resultSet.getString("registration_no"));
            carDTO.setEngineno(resultSet.getString("engine_no"));
            carDTO.setVerfiedAdminId(resultSet.getInt("verified_admin_id"));
            cars.add(carDTO);

        }
        return cars;
    }

    public  static PreparedStatement carUpdateMapper(PreparedStatement preparedStatement, CarDTO carDTO) throws SQLException{
        preparedStatement.setString(1,carDTO.getBrand());
        preparedStatement.setString(2,carDTO.getModel());
        preparedStatement.setString(3, carDTO.getColour());
        preparedStatement.setString(4,carDTO.getFeatures());
        preparedStatement.setInt(5,carDTO.getSeatingcapacity());
        preparedStatement.setString(6,carDTO.getFuelType());
        preparedStatement.setString(7,carDTO.getVeified());
        preparedStatement.setDouble(8,carDTO.getMilage());
        preparedStatement.setString(9,carDTO.getChasisno());
        preparedStatement.setString(10,carDTO.getRegistrationno());
        preparedStatement.setString(11,carDTO.getEngineno());
        preparedStatement.setInt(12,carDTO.getVerfiedAdminId());
        preparedStatement.setInt(13,carDTO.getId());
        return preparedStatement;

    }
}
