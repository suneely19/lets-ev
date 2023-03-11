package com.india.letsev.servlet;

import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.BookingService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteBookingServlet extends HttpServlet {
    private BookingService service;

    @Override
    public void init() throws ServletException {
     service=new BookingService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            int id=Integer.valueOf(req.getParameter("id"));
            service.deleteBooking(id);
            resp.sendRedirect("delete-booking-success.jsp");
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("delete-booking-failure.jsp");
        }
    }
}
