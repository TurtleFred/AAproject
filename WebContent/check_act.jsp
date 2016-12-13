<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询活动</title>
</head>

<body background="images/120.jpg">
    <center>
    <h2>查询活动</h2>
                你好，<%=session.getAttribute("userName")%>
    <table align=center border=1>
        <tr>
        <th>活动名称</th>
        <th>应付金额</th>
        </tr>
        <%int size=(Integer)session.getAttribute("size");
        for (int i=0;i<size;i++) {%>
            <tr>
                <td><%=session.getAttribute("activity"+i)%></td>
                <td><%=session.getAttribute("pay"+i)%></td>
            </tr><%} %>
    </table>
    请确认活动信息后选择操作:
    <input type="button" value="返回" onclick="javascript :history.back(-1)"/>
    </center>
</body>
</html>