package com.india.letsev.servlet;

import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserRegistrationServlet extends HttpServlet {
    UserService service;
    @Override
    public void init(ServletConfig config) throws ServletException {
        service =new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            boolean flag=service.createUserTable();
            if(flag){
                resp.sendRedirect("user-table-create-success.jsp");
            }else{
                resp.sendRedirect("user-table-create-failure.jsp");
            }
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("user-table-create-failure.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
