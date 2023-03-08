package com.india.letsev.mapper;

import com.india.letsev.dto.BookingDTO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingMapper {

    public static PreparedStatement BookingInsertMapper(PreparedStatement preparedStatement, BookingDTO bookingDTO) throws SQLException {
        preparedStatement.setInt(1, bookingDTO.getId());
        preparedStatement.setString(2, bookingDTO.getUser_id());
        preparedStatement.setInt(3, bookingDTO.getCar_id());
        preparedStatement.setString(4, bookingDTO.getBoarding());
        preparedStatement.setString(5, bookingDTO.getDestination());
        preparedStatement.setInt(6, bookingDTO.getDuration());
        preparedStatement.setDouble(7, bookingDTO.getAmount());
        return preparedStatement;

    }
}