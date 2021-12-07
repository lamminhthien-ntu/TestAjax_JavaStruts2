package com.thuctap.struts2_crud_mybatis.action;


import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.SessionAware;
public class LoginAction extends ActionSupport implements SessionAware{

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
    public String login() {
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
        return INPUT;
    }
   


    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
        // TODO Auto-generated method stub
        
    }
    
}
