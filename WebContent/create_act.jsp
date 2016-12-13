<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>建立活动</title>
</head>

<script type="text/javascript">




</script>

<body>
    <form action="create.action" method="post">
        <table align="center">
            <caption>
                <b>建立活动</b>
            </caption>
            <tr><td><%=session.getAttribute("userName")%>:</td></tr>
            <tr><td>建立如下活动：</td></tr>
            <tr>
                <td>活动名称：<input type="text" name=activity /></td>
            </tr>
            <tr>
                <td> 总金额： <input type="text" name="cost" /></td>
            </tr>
            <tr>
                <td> 总人数： <input type="text" name="people" /></td>
            </tr>
            <tr>
                <td>请选择活动模式：
                    <input type="radio" name="actType" value="after" checked="checked" />活动后结账
                    <input type="radio" name="actType" value="before" />活动前预估
                </td>
            </tr>
            <tr>
                <td>请选择支付策略：
                    <input type="radio" name="payType" value="standard" checked="checked" />标准AA制
                    <input type="radio" name="payType" value="rest" />舍零AA制
                    <input type="radio" name="payType" value="self" />自定义支付
                </td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="button" value="返回" onclick="javascript :history.back(-1)" /></td>
                <td colspan="2"><input type="reset" value="重置"/></td>
                <td colspan="2"><input type="submit" value="确认"/></td>
            </tr>
        </table>
    </form>
</body>
</html>