package com.india.letsev.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.util.ConnectionUtil;

public class BookingRepository {

	public boolean createBookingTable() throws LetsEVDBException {
		try {
			Connection connection = ConnectionUtil.getConnection();
			Statement statement = connection.createStatement();
			return statement.execute(QueryConstants.CREATE_BOOKING_QUERY);

		} catch (Exception e) {
			throw new LetsEVDBException("Exception occured while creating the Booking table", e);

		}
	}

	public int insertBooking(BookingDTO bookingDTO) throws LetsEVDBException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(QueryConstants.INSERT_BOOKING_QUERY);

			preparedStatement.setInt(1, bookingDTO.getId());
			preparedStatement.setString(2, bookingDTO.getUser_id());
			preparedStatement.setInt(3, bookingDTO.getCar_id());
			preparedStatement.setString(4, bookingDTO.getBoarding());
			preparedStatement.setString(5, bookingDTO.getDestination());
			preparedStatement.setInt(6, bookingDTO.getDuration());
			preparedStatement.setDouble(7, bookingDTO.getAmount());

			return preparedStatement.executeUpdate();

		} catch (Exception e) {
			throw new LetsEVDBException("Exception occured while Booking the Car", e);
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				throw new LetsEVDBException("Exception occured while closing the connection", e);
			}
		}

	}

}
