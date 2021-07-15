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
        HttpServletRequest request1= (HttpServletRequest) request;
        response.setContentType("text/html;charset=UTF-8");
        response1.setHeader("Access-Control-Allow-Origin", "*");
        response1.setHeader("Access-Control-Allow-Methods", "*");
        response1.setHeader("Access-Control-Max-Age", "3600");
        response1.setHeader("Access-Control-Allow-Headers", "Origin,No-Cache,x-requested-with,If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,Authorization,SessionToken,JSESSIONID,token");
        response1.setHeader("Access-Control-Allow-Credentials", "true");
        response1.setHeader("XDomainRequestAllowed","1");
        chain.doFilter(request1, response1);
    }
}
