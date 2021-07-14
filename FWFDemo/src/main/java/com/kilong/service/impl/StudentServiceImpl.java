package com.kilong.service.impl;

import com.kilong.dao.StudentDao;
import com.kilong.domain.Student;
import com.kilong.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private InputStream in;
    private SqlSession session;
    private StudentDao studentDao;

    public StudentServiceImpl() throws IOException {
        //读取配置文件
        in= Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        //使用工厂生产SqlSession对象
        session=factory.openSession();
        //使用SqlSession创建代理对象
        studentDao=session.getMapper(StudentDao.class);
    }

    @Override
    public List<Student> FindAll() throws IOException {
        List<Student> students = studentDao.FindAll();
        return students;
    }

    @Override
    public Student ByIdFind(int id) {
         Student student=null;
         student = studentDao.ByIdFind(id);
        return student;
    }

    @Override
    public int InsertStudent(Student student) {
        int i = studentDao.InsertStudent(student);
        session.commit();
        return i;
    }

    @Override
    public int DeleteStudent(int uid) {
        int i = studentDao.DeleteStudent(uid);
        session.commit();
        return i;
    }

    @Override
    public int UpdateStudent(Student student) {
        int i = studentDao.UpdateStudent(student);
        session.commit();
        return i;

    }


}
