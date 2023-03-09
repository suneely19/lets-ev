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

public class GetUserByIdServlet extends HttpServlet {
    private UserService service;

    @Override
    public void init() throws ServletException {
        service=new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.valueOf(req.getParameter("id"));
        try{
            UserDTO user=service.getUser(id);
            req.setAttribute("user",user);
            RequestDispatcher dispatcher=req.getRequestDispatcher("update-user.jsp");
            dispatcher.forward(req,resp);
        }catch(LetsEVGeneralException e){
            resp.sendRedirect("get-user-failure.jsp");
        }
    }
}
