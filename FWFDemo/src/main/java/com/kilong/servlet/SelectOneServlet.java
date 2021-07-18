package com.kilong.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kilong.domain.Student;
import com.kilong.service.StudentService;
import com.kilong.service.impl.StudentServiceImpl;
import com.kilong.util.Result;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/findone")
public class SelectOneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String line=null;
        String json="";
        while ((line=reader.readLine())!=null){
            json+=line;
        }
        ObjectMapper objectMapper=new ObjectMapper();
        Student student=objectMapper.readValue(json,Student.class);
        StudentService service=new StudentServiceImpl();
        Student student1 = service.ByIdFind(student.getUid());
        String json1="";
        if (student1==null){
            json1 = Result.ResultStudent("1", "查无此人", student1);
        }else {
            json1 = Result.ResultStudent("0", "查询成功", student1);
        }

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json1);
    }
}
