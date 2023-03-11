package com.india.letsev.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class LetsEvFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request= (HttpServletRequest) servletRequest;
        String url=request.getRequestURL().toString();
        System.out.println(url);

        if(!url.contains("booking") && !url.contains("car") && !url.contains("user") && !url.contains("admin") && !url.contains("index.jsp")) {
            PrintWriter writer=servletResponse.getWriter();
            writer.println("<html><h1> The Requested URL is not corresponding to Our Application, Please check and provide the correct URl</h1>" +
                    "<br><a align='center' href='index.jsp'>Home</a></html>");

        }else if(url.contains("booking")){
            PrintWriter writer=servletResponse.getWriter();
            writer.println("<html><h1> Still we are not fully implemented booking module please try after few days</h1>" +
                    "<br><a href='index.jsp'>Home</a></html>");
        }else{
           filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
