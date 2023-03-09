package com.india.letsev.servlet;

import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.BookingService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CarBookingEditServlet extends HttpServlet {
    private BookingService service;

    @Override
    public void init() throws ServletException {
        service=new BookingService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookingDTO bookingDTO=new BookingDTO();
        bookingDTO.setId(Integer.valueOf(req.getParameter("id")));
        bookingDTO.setUser_id(req.getParameter("User_id"));
        bookingDTO.setCar_id(Integer.valueOf(req.getParameter("User_id")));
        bookingDTO.setBoarding(req.getParameter("Boarding"));
        bookingDTO.setDestination(req.getParameter("Destination"));
        bookingDTO.setDuration(Integer.valueOf(req.getParameter("Duration")));
        bookingDTO.setAmount(Integer.valueOf(req.getParameter("Amount")));

        try{
            service.updateBooking(bookingDTO);
            resp.sendRedirect("booking-update-success.jsp");
        }catch(LetsEVGeneralException e){
            resp.sendRedirect("booking-update-failure.jsp");
        }


    }
}
