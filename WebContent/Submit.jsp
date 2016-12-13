<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>活动</title>
</head>
<script src="https://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js">

</script>

<body>
<form>

    <table align="center">
        <caption>
               <b>最终确认活动</b>
        </caption>
            <tr><td><%=session.getAttribute("userName")%>:</td></tr>
            <tr><td>活动信息如下：</td></tr>
            <tr>
                <td>活动名称：<input type="hidden" name=activity value=${activity } />${activity } (密钥：${pin })</td>
            </tr>
            <tr>
                <td> 总金额：${cost }</td>
            </tr>
            <tr>
                <td> 总人数：${people }</td>
            </tr>
            <tr>
                <td> 每人应支付：${idealCost }<script>pName = ${pName } ;people = ${people }</script></td>
            </tr>
            <tr><td>人员：</td></tr>
            <tr><td><script>
            $(function() {
                var tmp = '<%=session.getAttribute("pName")%>';
                var pname = tmp.split(", ");

                for(i=0;i<pname.length;i++) {
                	
                	$("p").append("第" + (i+1) + "个成员：");
                    $("p").append(pname[i]);
                    $("p").append("<br>");
                }
                	
            });</script><p></p>记得通知大家用上述姓名登录查询哦！</td></tr>
            
            <tr align="center">
                <td colspan="2"><input type="button" value="重新编辑" onclick="location='create_act.jsp'"/></td>
                <td colspan="2"><input type="button" value="确认" onclick="location='main.jsp'" />
            </tr>
    </table>
</form>    
</body>
</html>