<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询活动</title>
</head>
<body>
    <center>
    <h2>查询活动</h2>
                你好，<%=request.getParameter("userName")%> @@ <s:property value="userName" default="未接收到信息"/>&& ${userName }你已参加如下活动：
                <% String str = session.getAttribute("userName").toString();
                out.print(str);%>
    <table align=center border=1>
        <tr>
        <th>活动名称</th>
        <th>应付金额</th>
        </tr>
            <tr>
                <td>${activity } </td>
                <td>${cost }</td>
            </tr>
    </table>
    请确认活动信息后选择操作:
    <input type="button" value="返回" onclick="javascript :history.back(-1)"/>
    </center>
</body>
</html>