package com.india.letsev.servlet;

import com.india.letsev.dto.UserDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetAllUsersServlet extends HttpServlet {
    private UserService service;

    @Override
    public void init() throws ServletException {
        service=new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            List<UserDTO> users=service.getAllUsers();
            req.setAttribute("users",users);
            RequestDispatcher dispatcher=req.getRequestDispatcher("view-all-users.jsp");
            dispatcher.forward(req,resp);
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("view-all-users-failure.jsp");
        }
    }
}
