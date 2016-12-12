package action;

import java.util.Map;

import impl.Regist;
import impl.Select;
import dmo.SQL_word;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * ��ҳ������� ��search������insert������
 * 
 * ���ܣ���½��ע��
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
    
    //ע�� ��Ӧjsp:regist.jsp
    public String regist() {
        // ��֤�Ϸ���
        resultInt = regImpl.findByUserName(userName);
        if ("".equals(userName) || userName == null) {
            resultMsg = "�û�������Ϊ��";
            return "registerFailure";
        } else if ("".equals(passWord) || passWord == null) {
            resultMsg = "���벻��Ϊ��";
            return "registerFailure";
        } 
        if (resultInt != 0) {
            resultMsg = "�û����ѱ�ʹ�ã�����������";
            return "registerFailure";
        } 
        
        else {
            resultInt = regImpl.regist(userName, passWord);
            if (1 == resultInt) {
                // 1. ���û���Ϣ���浽Session�С�
                session.put("userName", userName);
                session.put("passWord", passWord);
                // 2. ������Ϣ
                resultMsg = "ע��ɹ�";
                return "registerSuccess";
            } else {
                resultMsg = "ע��ʧ��";
                return "registerFailure";
            }
        }
    }

    // ��¼ ��Ӧjsp��login.jsp
    public String login() {
        resultMsg = null;
        // ���û��������ʽ������֤
        if ("".equals(userName) || userName == null) {
            resultMsg = "�û�������Ϊ��";
            return "checkFailure";
        } else if ("".equals(passWord) || passWord == null) {
            resultMsg = "���벻��Ϊ��";
            return "checkFailure";
        } 
        // ���ݿ��ѯ�������û����������ݿ�������ƥ�����
        Select selectConOpe = new Select();
        int resultInt = selectConOpe.selectStatement(word.Select_User(userName, passWord));
        // int resultInt =
        // selectConOpe.selectPreparedStatement(userName,passWord);

        if (1 == resultInt) {
            resultMsg = "��¼�ɹ�";
            session.put("userName", userName);
            session.put("passWord", passWord);
            return "loginSuccess";
        } else {
            resultMsg = "��¼ʧ��";
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