package com.india.letsev.servlet;

import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.BookingDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.AdminService;
import com.india.letsev.service.BookingService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetBookingByIdServlet extends HttpServlet {
    private BookingService service;

    @Override
    public void init() throws ServletException {
        service=new BookingService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.valueOf(req.getParameter("id"));
        try {
            BookingDTO booking = service.getBooking(id);
            req.setAttribute("booking",booking);
            RequestDispatcher dispatcher=req.getRequestDispatcher("update-booking.jsp");
            dispatcher.forward(req,resp);
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("get-bookinh-failed.jsp");
        }
    }
}
