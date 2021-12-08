package com.thuctap.struts2_crud_mybatis.action;
 
import java.util.Map;

import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.SessionAware;
 
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
 
public class TestSession extends ActionSupport implements SessionAware {
     
    private Map<String, Object> sessionMap;
    private String userName;


    private String password;
    


    // @Actions({
    //     @Action(value = "/login", results = {
    //         @Result(name = "input",location = "/login.jsp"),
    //         @Result(name = "success",location = "/index.jsp")
    //     })
    // })
    // public String login() {
    //     String loggedUserName = null;
 
    //     // check if the userName is already stored in the session
    //     if (sessionMap.containsKey("userName")) {
    //         loggedUserName = (String) sessionMap.get("userName");
    //     }
    //     if (loggedUserName != null && loggedUserName.equals("admin")) {
    //         return SUCCESS; // return welcome page
    //     }
         
    //     // if no userName stored in the session,
    //     // check the entered userName and password
    //     if (userName != null && userName.equals("admin")
    //             && password != null && password.equals("nimda")) {
             
    //         // add userName to the session
    //         sessionMap.put("userName", userName);
             
    //         return SUCCESS; // return welcome page
    //     }
         
    //     // in other cases, return login page
    //     // Add action Error
    //     addActionError("Username or password is incorrect");
    //     return INPUT;
    // }
    
 
    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }
}