package com.india.letsev.servlet;

import com.india.letsev.dto.AdminDto;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditAdminServlet extends HttpServlet {

    private AdminService service;

    @Override
    public void init() throws ServletException {
        service=new AdminService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminDto AdminDto = new AdminDto();
        AdminDto.setId(Integer.valueOf(req.getParameter("id")));
        AdminDto.setName(req.getParameter("name"));
        AdminDto.setAddress(req.getParameter("address"));
        AdminDto.setMailid(req.getParameter("mailid"));
        AdminDto.setMobile(req.getParameter("mobile"));
        AdminDto.setExperiance(Integer.valueOf(req.getParameter("experiance")));
        AdminDto.setSalary(Double.valueOf(req.getParameter("salary")));

        try{
            service.updateAdmin(AdminDto);
            resp.sendRedirect("admin-update-success.jsp");
        }catch(LetsEVGeneralException e){
            resp.sendRedirect("admin-update-failure.jsp");
        }
    }
}
