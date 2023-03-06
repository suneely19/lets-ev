package com.india.letsev.servlet;

import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminRegisterServlet extends HttpServlet {

    AdminService service;


    @Override
    public void init() throws ServletException {
        service=new AdminService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
           boolean flag= service.createAdminTable();
           if(flag){
               resp.sendRedirect("admin-table-create-success.jsp");
           }else {
               resp.sendRedirect("admin-table-create-failure.jsp");
           }
        }catch (LetsEVGeneralException e){
                resp.sendRedirect("admin-table-create-failure.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
