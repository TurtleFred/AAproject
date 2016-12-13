<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error</title>
</head>
<body background="images/e.jpg">
    <table >
     <tr>
                    <td >
                        <hr align="center"  size="150" color="20D0CA">
                    </td>
                    
                </tr>
                </table> 
    <center>出错！<s:property value="resultMsg" default="未接收到信息"/></center>
    <input type="button" value="返回" onclick="javascript :history.back(-1)"/>
</body>
</html>