<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户界面</title>
</head>
<body>
    <form>
    <center>
    <h2>主界面</h2>
     你好，<s:property value="userName" default="未接收到信息"/> && ${userName } ***
     
     <%  
              String name=request.getParameter("userName");  
              session.setAttribute("username",name);
       %>
       Your name is:<%=request.getParameter("userName")%>
    <input type=button value=建立活动 onclick="location='create_act.jsp'">
    <input type=button value=查询活动  onclick="location='check_act.jsp'">
    </center>
    </form>
</body>
</html>