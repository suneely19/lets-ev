package com.india.letsev.servlet;

import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CarRegistrationServlet extends HttpServlet {

    private CarService service;

    @Override
    public void init() throws ServletException {
        service=new CarService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        try{
           service.createCarTable();
           resp.sendRedirect("car-table-create-success.jsp");
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("car-table-create-failure.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarDTO carDTO=new CarDTO();
        carDTO.setId(Integer.valueOf(req.getParameter("id")));
        carDTO.setBrand(req.getParameter("brand"));
        carDTO.setColour(req.getParameter("colour"));
        carDTO.setModel(req.getParameter("model"));
        carDTO.setFeatures(req.getParameter("features"));
        carDTO.setSeatingcapacity(Integer.valueOf(req.getParameter("seatingcapacity")));
        carDTO.setFuelType(req.getParameter("fueltype"));
        carDTO.setMilage(Integer.valueOf(req.getParameter("milage")));
        carDTO.setChasisno(req.getParameter("chasisno"));
        carDTO.setRegistrationno(req.getParameter("registrationno"));
        carDTO.setEngineno(req.getParameter("engineno"));
        try {
         service.carRegister(carDTO);
         resp.sendRedirect("car-registration-success.jsp");
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("car-registration-failure.jsp");
        }

    }
}
