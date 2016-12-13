<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息</title>
</head>
<body>
    <form action="create.action" method="post">
        <table align="center">
            <caption>
                <b>修改个人信息</b>
            </caption>
            <tr><td><%=session.getAttribute("userName")%>:</td></tr>
            <tr>
                <td>活动名称：<input type="text" name=activity /></td>
            </tr>
            <tr>
                <td> 总金额： <input type="text" name="cost" /></td>
            </tr>
            <tr>
                <td>活动密钥（选填）：  <input type=text id=p name=pin value="" style="display:none"><input type=button value="添加密钥" id=pina onclick=addpin()><input type=button value="取消" id=pind style="display:none" onclick=delpin() ></td>
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
                    <input type="radio" name="payType" value="restFree" />舍零AA制
                    <input type="radio" name="payType" value="selfSet" />自定义支付
                </td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="reset" value="重置"/></td>
                <td colspan="2"><input type="submit" value="确认"/></td>
            </tr>
        </table>
    </form>
</body>
</html>