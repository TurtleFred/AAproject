<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户界面</title>
</head>
<script>function click1() {
    
	document.Check.action='check_act';
	document.Check.submit();
}
function click2() {
    
    document.Check.action='create_act.jsp';
    document.Check.submit();
}
function click3() {
    
    document.Check.action='login.jsp';
    document.Check.submit();
}
</script>
<body background="images/de.jpg">
    <form name=Check method=post action="">
    <center>
    <h2>主界面</h2>
     hello，<%=session.getAttribute("userName")%>:
     <p>
    <input type=button value=重新登录  onclick="click3()">
    </p>
    <p>
    <input type=submit value=建立活动 onclick="click2()">
    </p>
    <p>
        <input type=button value=查询活动  onclick="click1()">
        </p>
    </center>
    </form>
</body>
</html>