<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>建立活动</title>

</head>
<body>
    <form action="create.action" method="post">
        <table align="center">
            <caption>
                <b>建立活动</b>
            </caption>
            <tr>
                <td>活动名称：<input type="text" name=activity /></td>
            </tr>
            <tr>
                <td> 总金额： <input type="text" name="cost" /></td>
            </tr>
            <tr>
                <td>活动密钥（选填）： <input type="text" name="pin" /></td>
            </tr>
            <tr>
                <td> 总人数： <input type="text" name="people" /></td>
            </tr>
            
            <tr align="center">
                <td colspan="2"><input type="reset" value="重置"/></td>
                <td colspan="2"><input type="submit" value="确定"/></td>
            </tr>
        </table>
    </form>
</body>
</html>