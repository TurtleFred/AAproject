<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>

</head>
<body>
	<form action="login.action" method="get">
		<table align="center">
			<caption>
				<b>用户登录</b>
			</caption>
			<tr>
			<td>用户名：<input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>密码： <input type="text" name="passWord" /></td>
			</tr>
			<tr align="middle">
				<td colspan="2"><input type="submit" /></td>
                <td colspan="2"><input type="button" value="注册" onclick="location='regist.jsp'"/></td>
            </tr>
		</table>
	</form>
</body>
</html>


