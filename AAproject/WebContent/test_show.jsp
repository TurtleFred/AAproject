<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>活动</title>
</head>

<script type="text/javascript">
function addrow() {
str=document.all.t.outerHTML;
str+="<tr align=center><td colspan=2><input type=text name=name ><br></td></tr>";
document.all.t.outerHTML=str;
}

function a() {
	alert("...");
}
</script>

<body>
    <form action=insert_people.action method=post>

    <table align="center" id=t>
        <caption>
               <b>建立活动</b>
        </caption>
            <tr><td>姓名：<input type=text name=name></td> <td>活动：<input type=text name=activity></td> <td>人均：<input type=text name=percost></td><td>实际支付：<input type=text name=real>元</td></tr>
            <tr><td>添加人员测试：</td></tr>
            
            <!--
            <tr align="center"><td colspan="2"><button onclick="javascript:document.body.innerHTML+='姓名：<input type=text name=name> 实际支付：<input type=text name=real> <br>';" >添加文本框</button></td></tr>
            -->
             <tr align=center><td colspan=2><input type=button value=添加 onclick=addrow() > </td></tr>
    </table>
    <input type=submit value=提交 >
    </form>
</body>
</html>