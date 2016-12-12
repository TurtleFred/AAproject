<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<table width="100%" border=0>
      <tr>
        <td width="15%" height="10">当前用户：<s:property value="#session.userName"/></td>
        <td align="center" bgcolor="#FFCC33" class="font"><a href="create">创建活动</a></td>
        <td align="center" bgcolor="#FFCC33" class="font"><a href="check_act">查询活动</a></td>
        <td width="85%" align="right" id="bgclock"></td>
      </tr>
 </table>