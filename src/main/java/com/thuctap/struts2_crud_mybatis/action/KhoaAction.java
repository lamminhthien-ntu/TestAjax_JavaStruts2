package com.thuctap.struts2_crud_mybatis.action;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.google.gson.Gson;
import com.thuctap.struts2_crud_mybatis.model.*;

public class KhoaAction {
    private List<Student> students;
    

    public List<Student> getStudents() {
        return students;
    }


    public void setStudents(List<Student> students) {
        this.students = students;
    }


    HttpServletResponse response = ServletActionContext.getResponse();


    @Action(value = "/khoa/index",results = { @Result(name = "success",location = "/index.html") })
    public String viewKhoa() throws IOException{
        PrintWriter printWriter = response.getWriter();
        //response.setStatus(400);
       // printWriter.println("{\"message\":\"" + "Test message" + "\"}");

       //Generate list to prepare convert to json by gson method
       Student studenta = new Student();
       studenta.setName("Thien");
       studenta.setBranch("60cntt1");
       studenta.setEmail("thien12@gmail.com");
       studenta.setPercentage(90);
       studenta.setPhone(8412471);

       Gson gson = new Gson();
       String json = gson.toJson(studenta); 

       //Convert object to json
       printWriter.print(json);
       

        printWriter.flush();
        printWriter.close();
    
        return "success";
    }

    
}
