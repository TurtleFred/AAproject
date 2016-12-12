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
<link rel="stylesheet" type="text/css" href="CSS/style.css">   
<script src="JS/check.js"></script>
<title>登录</title>

</head>
<body bgcolor="#DBFFB7">
	<form action="login.action" method="get">
	    <table align="center" width="100%">
			<tr>
                    <td align="center" width="50%">
                        <h1>AA project</h1>
                    </td>
            </tr>
            <tr>
               <td> 
					<table width="700" height="250"  align="center" bgcolor="#CCCCFF">
					    <tr>
							<td>用户登录 </td>	
							<td height="168" rowspan="5" align="center"><img src="images/3.jpg" height="250" width="500"></td>											
						</tr>
						<tr>
							<td>用户名：<input type="text" name="userName" /></td>												
						</tr>
						<tr>
							<td>密码： <input type="text" name="passWord" /></td>												
						</tr>
			            <tr align="center">
							<td><input type="submit" /></td>			    
			            </tr>
			            <tr align="center">
			                <td><input type="button" value="注册" onclick="location='regist.jsp'"/></td>
			            </tr>         			        
			        </table>
			                    						  

		</table>	    
	</form>
</body>
</html>