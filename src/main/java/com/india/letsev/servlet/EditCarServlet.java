package com.india.letsev.servlet;

import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditCarServlet extends HttpServlet {
    private CarService service;

    @Override
    public void init() throws ServletException {
        service=new CarService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarDTO CarDto = new CarDTO();
        CarDto.setId(Integer.valueOf(req.getParameter("id")));
        CarDto.setBrand(req.getParameter("Brand"));
        CarDto.setModel(req.getParameter("model"));
        CarDto.setColour(req.getParameter("colour"));
        CarDto.setFeatures(req.getParameter("Features"));
        CarDto.setSeatingcapacity(Integer.valueOf(req.getParameter("SeatingCapacity")));
        CarDto.setFuelType((req.getParameter("fueltype")));
        CarDto.setVeified((req.getParameter("veifed")));
        CarDto.setMilage(Double.valueOf(req.getParameter("mileage")));
        CarDto.setChasisno(req.getParameter("Chasisno"));
        CarDto.setRegistrationno(req.getParameter("Registrationno"));
        CarDto.setEngineno(req.getParameter("Engineno"));
        CarDto.setVerfiedAdminId(Integer.valueOf(req.getParameter("verifiedadminID")));

        try{
            service.updatecar(CarDto);
            resp.sendRedirect("car-update-success.jsp");
        }catch(LetsEVGeneralException e){
            resp.sendRedirect("Car-update-failure.jsp");
 }

    }
}
