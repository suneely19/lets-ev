package com.india.letsev.servlet;

import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class  DeleteCarServlet extends HttpServlet {
    private CarService service;

    @Override
    public void init() throws ServletException {
        service=new CarService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            int id=Integer.valueOf(req.getParameter("id"));
            boolean flag= service.deleteCar(id);
            resp.sendRedirect("delete-car-success.jsp");
        }catch (LetsEVGeneralException e){
            }

    }
}
