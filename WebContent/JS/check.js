//判断用户的输入是否合法
//--------------------------------------------------------
function check_personal(personal){
	if(personal.name.value==""){
		alert("请输入用户名!");
		personal.name.focus();
		return false;
	}
	if (personal.name.value.length>16||personal.name.value.length<3){
		alert("用户名必须在3～16个字符之间！");
		personal.name.focus();
		return false;
	}
	if(personal.password.value==""){
		alert("请输入密码!");
		personal.password.focus();
		return false;
	}
	if (personal.password.value.length>16||personal.password.value.length<3){
		alert("密码必须在3～16个字符之间！");
		personal.password.focus();
		return false;
	}
	if(personal.confirmPassword.value==""){
		alert("请确认密码!");
		personal.confirmPassword.focus();
		return false;
	}
	if (personal.confirmPassword.value!=personal.password.value){
		alert("密码不一致，请重新输入！");
		personal.confirmPassword.focus();
		return false;
	}
	if(personal.truename.value==""){
		alert("请输入真实姓名!");
		personal.truename.focus();
		return false;
	}
	if(personal.nation.value==""){
		alert("请输入民族!");
		personal.nation.focus();
		return false;
	}
	if(personal.work.value==""){
		alert("请输入职称!");
		personal.work.focus();
		return false;
	}
	if(personal.phone.value==""){
		alert("请输入电话号码!");
		personal.phone.focus();
		return false;
	}
	
	if(personal.place.value==""){
		alert("请输入住址!");
		personal.place.focus();
		return false;
	}
	if(personal.email.value==""){
		alert("请输入邮箱!");
		personal.email.focus();
		return false;
	}
	var i=personal.email.value.indexOf("@");
	var j=personal.email.value.indexOf(".");
	if((i<0)||(i-j>0)||(j<0)){
		alert("Email格式不正确，请重新输入！");
		personal.email.value="";
		personal.email.focus();
		return false;
	}
}
//----------------------------------------------------------------
function check_personalUp(personal){
	if(personal.truename.value==""){
		alert("请输入真实姓名!");
		personal.truename.focus();
		return false;
	}
	if(personal.nation.value==""){
		alert("请输入民族!");
		personal.nation.focus();
		return false;
	}
	if(personal.work.value==""){
		alert("请输入职称!");
		personal.work.focus();
		return false;
	}
	if(personal.phone.value==""){
		alert("请输入电话号码!");
		personal.phone.focus();
		return false;
	}
	
	if(personal.place.value==""){
		alert("请输入住址!");
		personal.place.focus();
		return false;
	}
	if(personal.email.value==""){
		alert("请输入邮箱!");
		personal.email.focus();
		return false;
	}
	var i=personal.email.value.indexOf("@");
	var j=personal.email.value.indexOf(".");
	if((i<0)||(i-j>0)||(j<0)){
		alert("Email格式不正确，请重新输入！");
		personal.email.value="";
		personal.email.focus();
		return false;
	}
}
//--------------------------------------------------
function check_personalUppassword(personal){
	if (personal.oldPassword.value==""){
		alert("请输入原密码！");
		personal.oldPassword.focus();
		return false;
	}
	if(personal.newPassword.value==""){
		alert("请输入新密码!");
		personal.newPassword.focus();
		return false;
	}
	if (personal.newPassword.value.length>16||personal.newPassword.value.length<3){
		alert("密码必须在3～16个字符之间！");
		personal.newPassword.focus();
		return false;
	}
	if(personal.confirmPassword.value==""){
		alert("请确认密码!");
		personal.confirmPassword.focus();
		return false;
	}
	if (personal.confirmPassword.value!=personal.newPassword.value){
		alert("密码不一致，请重新输入！");
		personal.confirmPassword.focus();
		personal.confirmPassword.value="";
		return false;
	}
	
}
//--------------------------------------------------
function check_friend(friend){
	if(friend.name.value==""){
		alert("请输入姓名!");
		friend.name.focus();
		return false;
	}
	if(friend.phone.value==""){
		alert("请输入电话号码!");
		friend.phone.focus();
		return false;
	}
	if(friend.email.value==""){
		alert("请输入邮箱!");
		friend.email.focus();
		return false;
	}
	var i=friend.email.value.indexOf("@");
	var j=friend.email.value.indexOf(".");
	if((i<0)||(i-j>0)||(j<0)){
		alert("Email格式不正确，请重新输入！");
		friend.email.value="";
		friend.email.focus();
		return false;
	}
	if(friend.workplace.value==""){
		alert("请输入职称!");
		friend.workplace.focus();
		return false;
	}
	
	
	if(friend.place.value==""){
		alert("请输入住址!");
		friend.place.focus();
		return false;
	}
	if(friend.QQ.value==""){
		alert("请输入住址!");
		friend.QQ.focus();
		return false;
	}
	
}
//---------------------------------------------------
function check_dates(dates){
	if(dates.title.value==""){
		alert("请输入标题!");
		dates.title.focus();
		return false;
	}
}
//-------------------------------------------------------
function check_files(files){
	if(files.title.value==""){
		alert("请输入标题!");
		files.title.focus();
		return false;
	}
	if(files.upLoad.value==""){
		alert("请输选择要上传的文件!");
		files.upLoad.focus();
		return false;
	}
}
//--------------------------------------------------------
