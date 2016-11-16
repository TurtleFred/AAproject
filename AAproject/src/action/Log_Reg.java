package action;

import java.util.Map;

import impl.Regist;
import impl.Select;
import dmo.SQL_word;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class Log_Reg extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String            userName;
    private String            passWord;
    private String            resultMsg;
    private int               resultInt;
    
    Regist regImpl = new Regist();
    SQL_word word = new SQL_word();
    // 对应的jsp:
    // Namespace/类名!方法名.action
    // <form action="action/login!login.action">

    // Action!方法名.action
    // <form action="login!login.action">

    // 提交注册
    public String regist() {
        // 验证用户名是否重复
        resultInt = regImpl.findByUserName(userName);
        if ("".equals(userName) || userName == null) {
            resultMsg = "用户名不能为空";
            return "registerFailure";
        } else if ("".equals(passWord) || passWord == null) {
            resultMsg = "密码不能为空";
            return "registerFailure";
        } 
        if (resultInt != 0) {
            resultMsg = "用户名已被使用，请重新输入";
            return "registerFailure";
        } else {
            resultInt = regImpl.regist(userName, passWord);
            if (1 == resultInt) {
                // 1. 将用户信息保存到Session中。
                Map<String, Object> session = ActionContext.getContext().getSession();
                session.put("userName", userName);
                session.put("passWord", passWord);
                // 2. taglib标识传递
                resultMsg = "注册成功";
                return "registerSuccess";
            } else {
                resultMsg = "注册失败";
                return "registerFailure";
            }
        }
    }

    // 登录
    public String login() {
        resultMsg = null;
        // 对用户的输入格式进行验证//应定义在jsp页面javScript
        if ("".equals(userName) || userName == null) {
            resultMsg = "用户名不能为空";
            return "checkFailure";
        } else if ("".equals(passWord) || passWord == null) {
            resultMsg = "密码不能为空";
            return "checkFailure";
        } 
        // 数据库查询，根据用户输入与数据库中数据匹配情况
        Select selectConOpe = new Select();
        int resultInt = selectConOpe.selectStatement(word.Select_User(userName, passWord));
        // int resultInt =
        // selectConOpe.selectPreparedStatement(userName,passWord);

        if (1 == resultInt) {
            resultMsg = "登录成功";
            return "loginSuccess";
        } else {
            resultMsg = "登录失败";
            return "loginFailure";
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}