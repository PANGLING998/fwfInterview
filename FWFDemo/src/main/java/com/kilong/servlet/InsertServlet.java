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

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
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
        if (student1 == null) {
            int i = service.InsertStudent(student);
            if (i == 1){
                 json1 = Result.Resultall("0", "添加成功");
            }else {
                 Result.Resultall("1","添加失败");
            }
        }else {
            json1=Result.Resultall("1","学生已存在，添加失败");
        }

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json1);
    }
}
