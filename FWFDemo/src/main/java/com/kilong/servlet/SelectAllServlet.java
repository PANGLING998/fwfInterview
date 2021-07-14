package com.kilong.servlet;

import com.kilong.domain.Student;
import com.kilong.service.StudentService;
import com.kilong.service.impl.StudentServiceImpl;
import com.kilong.util.Result;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/findall")
public class SelectAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService service=new StudentServiceImpl();
        List<Student> students = service.FindAll();
        String json1="";
        if (students.isEmpty()){
             json1 = Result.ResultList("1", "", students);
        }else {
             json1 = Result.ResultList("0", "查询成功", students);
        }

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json1);
    }
}
