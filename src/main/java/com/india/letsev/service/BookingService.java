package com.india.letsev.service;

import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.BookingRepository;

public class BookingService {

    BookingRepository repository;

    public BookingService() {
        repository = new BookingRepository();
    }


    public int insertBooking(BookingDTO bookingDTO) throws LetsEVGeneralException {
        try {
            return repository.insertBooking(bookingDTO);
        } catch (LetsEVDBException e) {
            throw new LetsEVGeneralException("Exception occured while creating Booking table", e);
        }
    }
}