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

public class GetCarByIdServlet extends HttpServlet {
    private CarService service;

    public void init() throws ServletException{
    service=new CarService();
    }

    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int id=Integer.valueOf(req.getParameter("id"));
        try{
            CarDTO car = service.getCar(id);
            req.setAttribute("car",car);
            RequestDispatcher dispatcher= req.getRequestDispatcher("update-car.jsp");
            dispatcher.forward(req,resp);
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("get-car-failed.jsp");
        }
    }
}
