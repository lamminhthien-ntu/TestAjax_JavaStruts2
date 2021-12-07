package com.thuctap.struts2_crud_mybatis.action;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.SessionAware;
import com.thuctap.struts2_crud_mybatis.errors.*;
public class LoginAction extends ActionSupport implements SessionAware{
    //Respone hay dùng cho AJAX và JSON
    HttpServletResponse response = ServletActionContext.getResponse();

    private String username,password;
    private Map<String, Object> sessionMap ;

    
    public Map<String, Object> getUserSession() {
        return sessionMap;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Action(value = "/login",results = { 
        @Result(name = "success",location = "/index.html"),
        @Result(name = "input",location = "/login.html")
    })
    public String login() throws IOException {
        String loggedUserName = null;
 
        // check if the userName is already stored in the session
        if (sessionMap.containsKey("userName")) {
            loggedUserName = (String) sessionMap.get("userName");
           
        }
        if (loggedUserName != null && loggedUserName.equals("admin")) {
            return SUCCESS; // return welcome page
        }
         
        // if no userName stored in the session,
        // check the entered userName and password
        if (username != null && username.equals("admin")
                && password != null && password.equals("admin")) {
             
            // add userName to the session
            sessionMap.put("userName", username);
             
            return SUCCESS; // return welcome page
        }   
         
        // in other cases, return login page
        // Tạo một danh sách các lỗi bằng json thông qua Class ValidateError
                ArrayList<String> messages = new ArrayList<String>();
                messages.add("Username không hợp lệ" + username);
                messages.add("Password không hợp lệ" +password);
                PrintWriter printWriter = response.getWriter();
                 return ValidateError.push(messages, 400, response, printWriter);
                
    }
   


    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
        // TODO Auto-generated method stub
        
    }
    
}
