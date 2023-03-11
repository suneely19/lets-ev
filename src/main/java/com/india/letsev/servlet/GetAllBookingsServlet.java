package com.india.letsev.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.BookingService;

public class GetAllBookingsServlet extends HttpServlet {

	BookingService bookingService;

	@Override
	public void init() throws ServletException {
		bookingService = new BookingService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<BookingDTO> bookings = bookingService.getAllBookings();
			req.setAttribute("Bookings", bookings);
			RequestDispatcher dispatcher = req.getRequestDispatcher("view-all-bookings.jsp");
			dispatcher.forward(req, resp);
		} catch (LetsEVGeneralException e) {
			resp.sendRedirect("view-all-bookings-failure.jsp");
		}

	}
}
