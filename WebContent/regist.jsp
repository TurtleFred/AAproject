<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
    <center>
        <form action="regist.action" method="post">
            <table>
                <caption><b>用户注册</b></caption>
                <tr>
                    <td>用戶名:</td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="password" name="passWord" /></td>
                </tr>
                <tr>
                    <td>邮件地址:</td>
                    <td><input type="text" name="email" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="提交"/></td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>