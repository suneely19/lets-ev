package com.india.letsev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	           boolean flag= bookingService.createBookingTable();
	           if(flag){
	               resp.sendRedirect("Booking-table-create-success.jsp");
	           }else {
	               resp.sendRedirect("Booking-table-create-failure.jsp");
	           }
	        }catch (LetsEVGeneralException e){
	                resp.sendRedirect("Booking-table-create-failure.jsp");
	        }
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
