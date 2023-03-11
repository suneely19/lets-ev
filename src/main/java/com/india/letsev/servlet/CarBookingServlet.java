package com.india.letsev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.BookingService;

public class CarBookingServlet extends HttpServlet {

	BookingService bookingService;

	@Override
	public void init() throws ServletException {
		bookingService = new BookingService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			 bookingService.createBooking();
			 resp.sendRedirect("Booking-table-create-success.jsp");
		} catch (LetsEVGeneralException e) {
			resp.sendRedirect("Booking-table-create-failure.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookingDTO bookingDTO = new BookingDTO();
		bookingDTO.setId(Integer.parseInt(req.getParameter("id")));
		bookingDTO.setUser_id(req.getParameter("user_id"));
		bookingDTO.setCar_id(Integer.parseInt(req.getParameter("car_id")));
		bookingDTO.setBoarding(req.getParameter("boarding"));
		bookingDTO.setDestination(req.getParameter("destination"));
		bookingDTO.setDuration(Integer.parseInt(req.getParameter("duration")));
		bookingDTO.setAmount(Double.parseDouble(req.getParameter("amount")));

		try {
			bookingService.insertBooking(bookingDTO);
			resp.sendRedirect("booking-register-success.jsp");

		} catch (LetsEVGeneralException e) {
			resp.sendRedirect("booking-register-failure.jsp");
		}
	}

}
