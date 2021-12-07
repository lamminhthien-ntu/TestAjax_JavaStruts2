package com.thuctap.struts2_crud_mybatis.action;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.SessionMap;


import mybatis.mapper.StudentMapper;

import com.google.gson.Gson;
import com.thuctap.struts2_crud_mybatis.db.ConnectDB;
import com.thuctap.struts2_crud_mybatis.model.*;

public class KhoaAction {
    private String username,password;
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getpassword() {
        return password;
    }


    public void setpassword(String password) {
        this.password = password;
    }


    SessionMap<String,String> sessionmap;
    public List<Student> listStudents;
    private SqlSessionFactory sqlSessionFactory = ConnectDB.getSqlSessionFactory();

    public List<Student> getListStudents() {
        return listStudents;
    }


    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }


    HttpServletResponse response = ServletActionContext.getResponse();


    @Action(value = "/khoa/index",results = { @Result(name = "viewKhoa",location = "/index.html") })
    public String viewKhoa() throws IOException{
        PrintWriter printWriter = response.getWriter();
        //response.setStatus(400);
       // printWriter.println("{\"message\":\"" + "Test message" + "\"}");
        
       // Mở Session
        SqlSession session = sqlSessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        listStudents = studentMapper.getAll();
       //Convert object to json

    //    ArrayList<String> cars = new ArrayList<String>();
    //    cars.add("Volvo");
    //    cars.add("BMW");
    //    cars.add("Ford");
    //    cars.add("Mazda");
    //    System.out.println(cars);
       
       Gson gson = new Gson();
       String json = gson.toJson(listStudents); 

       printWriter.print(json);

       System.out.print(json);
       
        printWriter.flush();
        printWriter.close();
    
        return "viewKhoa";
    }

    

  

    
}
