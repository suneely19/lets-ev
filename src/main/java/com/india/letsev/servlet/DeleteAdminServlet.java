package com.india.letsev.servlet;

import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteAdminServlet extends HttpServlet {

    private AdminService service;

    @Override
    public void init() throws ServletException {
        service=new AdminService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            try{
                int id=Integer.valueOf(req.getParameter("id"));
               boolean flag= service.deleteAdmin(id);
               resp.sendRedirect("delete-admin-success.jsp");
            }catch (LetsEVGeneralException e){
                resp.sendRedirect("delete-admin-failure.jsp");
            }
    }

}
