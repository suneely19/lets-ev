package com.india.letsev.servlet;

import com.india.letsev.dto.UserDTO;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditUserServlet extends HttpServlet {


    private UserService service;
    @Override
    public void init() throws ServletException {
        service=new UserService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO userDTO=new UserDTO();
        userDTO.setId(Integer.valueOf("name"));
        userDTO.setName(req.getParameter("name"));
        userDTO.setMailid(req.getParameter("mailid"));
        userDTO.setAddress(req.getParameter("address"));
        userDTO.setMobileno(req.getParameter("mobileno"));
        userDTO.setLicence(req.getParameter("licence"));

        try{
            service.updateUser(userDTO);
            resp.sendRedirect("user-update-success.jsp");
        }catch (LetsEVGeneralException e){
            resp.sendRedirect("user-update-failure.jsp");
        }
    }
}
