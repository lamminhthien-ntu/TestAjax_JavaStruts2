<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Login</title>
</head>
<style type="text/css">
.welcome {
	background-color:green;
	border:1px solid black;
	width:400px;
}
//ul.actionMessage is added by Struts2 API 
ul.actionMessage li {
	color:yellow;
}
</style>
<body>
    <s:if test="hasActionMessages()">
    <div class="welcome">
        <s:actionmessage/>
    </div>
    </s:if>
    <br><br>
    <s:property value="getText('msg.welcome')" /> <s:property value="username"/>
    
    <center>
        <h3>Login</h3>
        <s:form action="login" method="post">
            <s:textfield name="userName" label="Enter User Name" />
            <s:password name="password" label="Enter Password" />
            <s:submit label="Login" />
        </s:form>
    </center>
</body>
</html>