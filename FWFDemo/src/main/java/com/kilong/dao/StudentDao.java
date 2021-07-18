package com.kilong.dao;

import com.kilong.domain.Student;

import java.util.List;

public interface StudentDao {
    /**
     *查询所有学生
     * @return
     */
    List<Student> FindAll();

    /**
     * 根据学号查询对应学生
     * @param uid
     * @return
     */
    Student ByIdFind(String uid);

    /**
     * 插入一条记录
     * @param student
     * @return
     */
    int InsertStudent(Student student);

    /**
     * 根据学号删除对应学生
     * @param uid
     * @return
     */
    int DeleteStudent(String uid);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    int UpdateStudent(Student student);
}
