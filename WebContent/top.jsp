<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<body>
  <table width="100%" height="50%" border="0">
      <tr>
        <td width="15%" height="10">当前用户：<s:property value="#session.userName"/></td>
        <td width="85%" align="right" id="bgclock"></td>
      </tr>
 </table>
</body>