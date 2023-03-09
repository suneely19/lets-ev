package com.india.letsev.servlet;

import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.CarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetCarByIdServlet extends HttpServlet {
    private CarService service;

    @Override
    public void init() throws ServletException {
        service=new CarService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            List<CarDTO> cars=service.getAllCar();
            req.setAttribute("Cars",cars);
            RequestDispatcher dispatcher=req.getRequestDispatcher("view-all-car.jsp");
            dispatcher.forward(req,resp);
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("view-all-cars-failure.jsp");

}
    }
}
