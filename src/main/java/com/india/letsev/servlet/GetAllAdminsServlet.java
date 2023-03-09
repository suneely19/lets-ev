package com.india.letsev.servlet;

import com.india.letsev.dto.AdminDto;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.AdminService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetAllAdminsServlet extends HttpServlet {

    private AdminService service;

    @Override
    public void init() throws ServletException {
        service=new AdminService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
            List<AdminDto> admins=service.getAllAdmins();
            req.setAttribute("admins",admins);
            RequestDispatcher dispatcher=req.getRequestDispatcher("view-all-admins.jsp");
            dispatcher.forward(req,resp);
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("view-all-admins-failure.jsp");

        }


    }
}
