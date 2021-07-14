package com.kilong.util;

import com.alibaba.fastjson.JSON;
import com.kilong.domain.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    public static String ResultList(String code, String message, List<Student> lists){
        Map<String,Object> rsMap=new HashMap<String,Object>();
        rsMap.put("code",code);
        rsMap.put("message",message);
        rsMap.put("data",lists);

        String json= JSON.toJSONString(rsMap);
        return json;
    }
    public static String ResultStudent(String code, String message, Student student){
        Map<String,Object> rsMap=new HashMap<String,Object>();
        rsMap.put("code",code);
        rsMap.put("message",message);
        rsMap.put("data",student);

        String json= JSON.toJSONString(rsMap);
        return json;
    }
    public static String Resultall(String code, String message){
        Map<String,Object> rsMap=new HashMap<String,Object>();
        rsMap.put("code",code);
        rsMap.put("message",message);

        String json= JSON.toJSONString(rsMap);
        return json;
    }
}
