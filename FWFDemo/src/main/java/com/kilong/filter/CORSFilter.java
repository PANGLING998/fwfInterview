package com.kilong.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "CORSFilter")
public class CORSFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response1= (HttpServletResponse) response;
//        response1.addHeader("Access-Control-Allow-Origin","*");
//        response1.setHeader("Access-Control-Allow-Origin", "*");
//        response1.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//        response1.setHeader("Access-Control-Max-Age", "3600");
//        response1.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        chain.doFilter(request, response);
    }
}
