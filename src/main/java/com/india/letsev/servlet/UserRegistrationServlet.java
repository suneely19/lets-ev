package com.india.letsev.servlet;

import com.india.letsev.dto.UserDTO;;
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
           service.createUserTable();
            resp.sendRedirect("user-table-create-success.jsp");
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("user-table-create-failure.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO UserDTO=new UserDTO();
        UserDTO.setId(Integer.valueOf(req.getParameter("id")));
        UserDTO.setName(req.getParameter("name"));
        UserDTO.setMailid(req.getParameter("mailid"));
        UserDTO.setAddress(req.getParameter("address"));
        UserDTO.setMobileno(req.getParameter("mobileno"));
        UserDTO.setLicence(req.getParameter("licence"));
        try{
            service.UserRegister(UserDTO);
            resp.sendRedirect("user-registration-success.jsp");
        }catch (LetsEVGeneralException e){

            resp.sendRedirect("user-registration-failure");
        }
    }
}
