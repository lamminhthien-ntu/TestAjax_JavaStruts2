package com.thuctap.struts2_crud_mybatis.action;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class KhoaAction {
    HttpServletResponse response = ServletActionContext.getResponse();


    @Action(value = "/khoa/index",results = { @Result(name = "success",location = "/index.html") })
    public String viewKhoa() throws IOException{
        PrintWriter printWriter = response.getWriter();
        //response.setStatus(400);
        // {
        //     "a": "thien",
        //     "b": "nam",
        //     "c": "ga"
        //   }
        printWriter.print("{\"a\": \"thien\", \"b\": \"nam\", \"c\": \"ga\"}");
        printWriter.flush();
        printWriter.close();
    
        return "success";
    }
    
}
