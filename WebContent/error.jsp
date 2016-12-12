<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error</title>
</head>
<body bgcolor="#F7FFF7">
   <table align="center" width="100%">
   <tr>
    <td height="168" rowspan="5" align="center"><img src="images/g.jpg" height="300" width="300"></td>
    </tr>	
	</table>
		<center><s:property value="resultMsg" default="未接收到信息"/></center>
	<input type="button" value="返回" onclick="javascript :history.back(-1)"/>
</body>
</html>