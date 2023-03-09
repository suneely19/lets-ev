package com.india.letsev.servlet;

import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteUserServlet extends HttpServlet {
    private UserService service;

    @Override
    public void init() throws ServletException {
        service=new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            int id=Integer.valueOf(req.getParameter("id"));
            boolean flag=service.deleteUser(id);
            resp.sendRedirect("delete-user-success.jsp");
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("delete-user-failure.jsp");
        }
    }
}
