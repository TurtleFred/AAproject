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
<script>
function addpeople(a) {

	var new_name = new Array(a);
    var new_ideal = new Array(a);
    var new_real = new Array(a);
    for (i=0;i<a;i++) {
        
        new_name[i] = document.createElement("input");
        new_real[i] = document.createElement("input");
        new_ideal[i] = document.createElement("input");
        
        new_name[i].type="text";
        new_name[i].placeholder="在此添加成员";
        new_name[i].name="pName";
        
        new_real[i].type="text";
        new_real[i].size=6;
        new_real[i].name="realCostt";
        new_real[i].placeholder="已付金额";
        
        new_ideal[i].type="text";
        new_ideal[i].size=6;
        new_ideal[i].name="idealCostt";
        new_ideal[i].placeholder="应付金额";
        
        $("p").append(new_name[i]);
        
        $("p").append("已支付的金额为：");
        $("p").append(new_real[i]);
        
        $("p").append("本次AA理论支付：");
        $("p").append(new_ideal[i]);
        $("p").append("<br>");
    }
}


</script>

<body>
<form action="createJoiner.action" method="post">

    <table align="center">
        <caption>
               <b>建立活动</b>
        </caption>
            <tr><td><%=session.getAttribute("userName")%>:</td></tr>
            <tr><td>你已建立如下活动：</td></tr>
            <tr>
                <td>活动名称：<input type="hidden" name=activity value=${activity } />${activity } (密钥：${pin })<input type="hidden" name=pin value=${pin } /></td>
            </tr>
            <tr>
                <td> 总金额：${cost }<input type="hidden" name=cost value=${cost } /></td>
            </tr>
            <tr>
                <td> 总人数：${people } <input type="hidden" name=people value=${people } /><script>Cost = ${cost }; people=${people }; per=Cost/people;</script><input type="hidden" name=ideal_cost value=${ideal_cost } /></td>
            </tr>
            <tr><td>请确认活动信息后依次输入信息：</td></tr>
            
            <tr><td><!-- <input type=button value="添加人员" id="addp" style="display:none" onclick=addpeople(1)> --><p><script>addpeople(people)</script></p></td></tr>
            
            <tr align="center">
                <td colspan="2"><input type="button" value="重新编辑" onclick="location='create_act.jsp'"/></td>
                <td colspan="2"><input type="submit" value="确认"/>
            </tr>
    </table>
</form>    
</body>
</html>