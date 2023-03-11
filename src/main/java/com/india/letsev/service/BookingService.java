package com.india.letsev.service;

import java.util.List;
import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.BookingRepository;

public class BookingService {

	BookingRepository repository;

	public BookingService() {
		repository = new BookingRepository();
	}

	public boolean createBooking() throws LetsEVGeneralException {
		try {
			return repository.createBookingTable();
		} catch (LetsEVDBException e) {
			throw new LetsEVGeneralException("Exception occured while creating Booking table", e);
		}
	}

	public int insertBooking(BookingDTO bookingDTO) throws LetsEVGeneralException {
		try {
			return repository.insertBooking(bookingDTO);
		} catch (LetsEVDBException e) {
			throw new LetsEVGeneralException("Exception occured while insert Booking table", e);
		}
	}
	public List<BookingDTO> getAllBookings() throws LetsEVGeneralException{
		try {
			return repository.getAllBooking();
		} catch (LetsEVDBException e) {
			throw new LetsEVGeneralException("Exception occured while fetching all Bookings", e);
		}	
	}
	public BookingDTO getBooking(int id) throws LetsEVGeneralException{
		try{
			return repository.getBooking(id);
		}catch(LetsEVDBException e){
			throw new LetsEVGeneralException("Exception occurred while Fetching the booking",e);
		}
	}
	public int updateBooking(BookingDTO bookingDTO) throws LetsEVGeneralException {
		try{
			return repository.updateBooking(bookingDTO);
		}catch(LetsEVDBException e){
			throw new LetsEVGeneralException("Exception occured while update Booking Table");
		}
	}


	public boolean deleteBooking(int id) throws LetsEVGeneralException {
		try{
			return repository.deleteBooking(id);
		}catch(LetsEVDBException e){
			throw new LetsEVGeneralException("exception occured while Delete Booking Table");
		}
	}
}