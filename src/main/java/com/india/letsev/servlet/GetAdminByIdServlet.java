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

public class GetAdminByIdServlet extends HttpServlet {

    private AdminService service;

    @Override
    public void init() throws ServletException {
        service=new AdminService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id=Integer.valueOf(req.getParameter("id"));
       try {
           AdminDto admin = service.getAdmin(id);
           req.setAttribute("admin",admin);
           RequestDispatcher dispatcher=req.getRequestDispatcher("update-admin.jsp");
           dispatcher.forward(req,resp);
       }catch (LetsEVGeneralException e){
            resp.sendRedirect("get-admin-failed.jsp");
       }
    }
}
