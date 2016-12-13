<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body background="images/000.jpg">
    <form action="login.action" method="get">    
    <table >
     <tr>
                    <td >
                        <hr align="center"  size="50" color="#806517">
                    </td>
                    
                </tr>
                </table>         
        <table align="center" width="200" height="200" border="0">
            <tr>
                <td>用户登录</td>
            </tr>
            <tr>
                <td>用户名：<input type="text" name="userName" /></td>
            </tr>
            <tr>
                <td>密码： <input type="text" name="passWord" /></td>
            </tr>
             <tr align="left">
                <td colspan="2"><input type="submit" /></td>
            </tr>
             <tr align="left">
                 <td colspan="2"><input type="button" value="新用户注册" onclick="location='regist.jsp'"/></td>
            </tr> 
  

            </table>      
    </form>
</body>
</html>