<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>活动</title>
</head>
<body>
    <table align="center">
        <caption>
               <b>建立活动</b>
        </caption>
            <tr><td>你已建立如下活动：</td></tr>
            <tr>
                <td>活动名称：${activity } (密钥：${pin })</td>
            </tr>
            <tr>
                <td> 总金额：${cost }</td>
            </tr>
            <tr>
                <td> 总人数：${people }</td>
            </tr>
            <tr><td>请确认活动信息后选择操作：</td></tr>
            <tr align="center">
                <td colspan="2"><input type="button" value="重新编辑" onclick="location='create_act.jsp'"/></td>
                <td colspan="2"><input type="button" value="确认" onclick="location='main.jsp'"/>
            </tr>
    </table>
    
</body>
</html>