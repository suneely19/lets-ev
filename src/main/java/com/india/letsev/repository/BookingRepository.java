package com.india.letsev.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.mapper.AdminMapper;
import com.india.letsev.mapper.BookingMapper;
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

	public boolean insertBooking(BookingDTO bookingDTO) throws LetsEVDBException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(QueryConstants.INSERT_BOOKING_QUERY);
			preparedStatement= BookingMapper.BookingInsertMapper(preparedStatement,bookingDTO);

			return preparedStatement.execute();

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

	public BookingDTO getBooking(int id) throws LetsEVDBException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(QueryConstants.GET_BOOKING_QUERY);
			preparedStatement.setInt(1,id);
			ResultSet resultSet=preparedStatement.executeQuery();
			return BookingMapper.populateBookingFromResultSetMapper(resultSet);
		} catch (Exception e) {
			throw new LetsEVDBException("Exception occurred while Fetching the Booking");

		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				throw new LetsEVDBException("Exception occurred while closing the connection");

			}
		}
	}




	public List<BookingDTO> getAllBooking() throws LetsEVDBException {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try{
			connection=ConnectionUtil.getConnection();
			preparedStatement=connection.prepareStatement(QueryConstants.GET_ALL_BOOKING_QUERY);
			ResultSet resultSet = preparedStatement.executeQuery();
			

			return BookingMapper.populateAllBoookingFromResultSetMapper(resultSet);

		}catch(Exception e){
			throw new LetsEVDBException("Exception occur while getting all bookings",e);
		}finally {
			try{
				preparedStatement.close();
				connection.close();
			}catch (Exception e){
				throw new LetsEVDBException("Exception occured while closing the connection",e);
			}
		}
	}
	public int updateBooking(BookingDTO bookingDTO) throws LetsEVDBException {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try{
			connection=ConnectionUtil.getConnection();
			preparedStatement=connection.prepareStatement(QueryConstants.UPDATE_BOOKING_QUERY);
			preparedStatement=BookingMapper.BookingUpdateMapper(preparedStatement,bookingDTO);

			return preparedStatement.executeUpdate();

		}catch(Exception e){
			throw new LetsEVDBException("Exception occur while booking a car",e);
		}finally {
			try{
				preparedStatement.close();
				connection.close();
			}catch (Exception e){

				throw new LetsEVDBException("Exception occur while closing the connection",e);
			}
		}
	}
	public boolean deletebooking(int id) throws LetsEVDBException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement=connection.prepareStatement(QueryConstants.DELETE_BOOKING_QUERY);
			preparedStatement.setInt(1,id);
			boolean flag=preparedStatement.execute();
			return flag;

		} catch (Exception e) {
			System.out.println(e);
			throw new LetsEVDBException("Exception occurred while Deleting the Booking");

		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				throw new LetsEVDBException("Exception occurred while closing the connection");

			}
		}
	}
}








