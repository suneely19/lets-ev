package com.india.letsev.mapper;

import com.india.letsev.dto.BookingDTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static List<BookingDTO> populateAllBoookingFromResultSetMapper(ResultSet resultSet) throws SQLException {
        List<BookingDTO> booking=new ArrayList<>();
        while (resultSet.next()){
            BookingDTO bookingDTO=new BookingDTO();
            bookingDTO.setId(resultSet.getInt("id"));
            bookingDTO.setUser_id(resultSet.getString("User_id"));
            bookingDTO.setCar_id(resultSet.getInt("Car_id"));
            bookingDTO.setBoarding(resultSet.getString("Boarding"));
            bookingDTO.setDestination(resultSet.getString("Destination"));
            bookingDTO.setDuration(resultSet.getInt("Duration"));
            bookingDTO.setAmount(resultSet.getDouble("amount"));
            booking.add(bookingDTO);
        }
        return booking;
    }
public static BookingDTO populateBookingFromResultSetMapper(ResultSet resultSet) throws SQLException {
    BookingDTO bookingDto=new BookingDTO();
    while (resultSet.next()){
        bookingDto.setId(resultSet.getInt("id"));
        bookingDto.setUser_id(resultSet.getString("user_id"));
        bookingDto.setCar_id(resultSet.getInt("car_id"));
        bookingDto.setBoarding(resultSet.getString("boarding"));
        bookingDto.setDestination(resultSet.getString("destination"));
        bookingDto.setDuration(resultSet.getInt("duration"));
        bookingDto.setAmount(resultSet.getDouble("amount"));
    }
    return bookingDto;
}

    public static PreparedStatement BookingUpdateMapper(PreparedStatement preparedStatement, BookingDTO bookingDTO) throws SQLException {
        preparedStatement.setString(1, bookingDTO.getUser_id());
        preparedStatement.setInt(2, bookingDTO.getCar_id());
        preparedStatement.setString(3, bookingDTO.getBoarding());
        preparedStatement.setString(4, bookingDTO.getDestination());
        preparedStatement.setInt(5, bookingDTO.getDuration());
        preparedStatement.setDouble(6, bookingDTO.getAmount());
        preparedStatement.setInt(7, bookingDTO.getId());
        return preparedStatement;

    }
    public static PreparedStatement BookingDeleteMapper(PreparedStatement preparedStatement, BookingDTO bookingDTO) throws SQLException {
        preparedStatement.setInt(1, bookingDTO.getId());
        return preparedStatement;
    }
}