package action;

import java.util.Map;

import impl.Regist;
import impl.Select;
import dmo.SQL_word;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * 本页代码包含 【search】、【insert】功能
 * 
 * 功能：登陆与注册
 * 
 * @author Baoxuan
 */
public class Log_Reg extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String            userName;
    private String            passWord;
    private String            resultMsg;
    private int               resultInt;
    
    Regist regImpl = new Regist();
    SQL_word word = new SQL_word();
    Map<String, Object> session = ActionContext.getContext().getSession();
    
    //注册 对应jsp:regist.jsp
    public String regist() {
        // 验证合法性
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
        } 
        
        else {
            resultInt = regImpl.regist(userName, passWord);
            if (1 == resultInt) {
                // 1. 将用户信息保存到Session中。
                session.put("userName", userName);
                session.put("passWord", passWord);
                // 2. 返回信息
                resultMsg = "注册成功";
                return "registerSuccess";
            } else {
                resultMsg = "注册失败";
                return "registerFailure";
            }
        }
    }

    // 登录 对应jsp：login.jsp
    public String login() {
        resultMsg = null;
        // 对用户的输入格式进行验证
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
            session.put("userName", userName);
            session.put("passWord", passWord);
            return "loginSuccess";
        } else {
            resultMsg = "登录失败";
            return "loginFailure";
        }
    }

    
    //get & set
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
    public void setSession(Map<String, Object> session) {
        // TODO Auto-generated method stub
        this.session=session;
    }
}