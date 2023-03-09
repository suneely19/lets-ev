package com.india.letsev.servlet;

import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.AdminService;
import com.india.letsev.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditCarServlet extends HttpServlet {

    private CarService service;
    public void init() throws ServletException {
        service=new CarService();
}
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
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

    try{
        service.updateCar(carDTO);
        resp.sendRedirect("car-update-success.jsp");
    }catch(LetsEVGeneralException e){
        resp.sendRedirect("car-update-failure.jsp");
    }
    }
}