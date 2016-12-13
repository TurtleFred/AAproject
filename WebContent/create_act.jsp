<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>建立活动</title>
</head>

<script type="text/javascript">

function addpin() {
         document.getElementById("p").style.display="";
         document.getElementById("pind").style.display="";
         document.getElementById("pina").style.display="none";
}

function delpin() {
    document.getElementById("p").style.display="none";
    document.getElementById("pind").style.display="none";
    document.getElementById("pina").style.display="";
}


</script>

<body background="images/st.jpg">
    <form action="create.action" method="post">
        <table align="center" width="500" height="200" border="0">
            <caption>
                <b>建立活动</b>
            </caption>
            <tr><td><%=session.getAttribute("userName")%>:</td></tr>
            <tr><td>建立如下活动：</td></tr>
            <tr>
                <td>活动名称：<input type="text" name=activity /></td>
            </tr>
            <tr>
                <td>  总金额： <input type="text" name="cost" /></td>
            </tr>
            <tr>
                <td>  总人数： <input type="text" name="people" /></td>
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
            </tr>
            <tr align="center">
                   <td colspan="2"><input type="submit" value="确认"/></td>
            </tr>
        </table>
    </form>
</body>
</html>