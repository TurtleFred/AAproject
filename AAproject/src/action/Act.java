package action;

import java.util.Map;

import impl.Create;
import impl.Insert;
import dmo.SQL_word;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class Act extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String activity , people_name , pin;
    private float cost , per_cost;
    private int people , real_num;
    private String            resultMsg;
    private int               resultInt;
    
    Create cre = new Create();
    SQL_word word = new SQL_word();
    
    // ��Ӧ��jsp:
    // Namespace/����!������.action
    // <form action="action/login!login.action">

    // Action!������.action
    // <form action="login!login.action">

    // �ύע��
    
    
    public String create() {
        resultMsg = null;
        if ("".equals(activity) || activity == null) {
            resultMsg = "δ����";
            return "checkFailure";
        } else if ("".equals(cost) || cost == 0) {
            resultMsg = "����û��������";
            return "checkFailure";
        } else if ("".equals(people) || people == 0) {
            resultMsg = "û���˲μӻ��";
            return "checkFailure";
        }
        Map<String, Object> session = ActionContext.getContext().getSession();
        session.put("activity", activity);
        session.put("pin", pin);
        session.put("cost", cost);
        session.put("people", people);
        resultMsg = "�����ɹ�";
        return "createSuccess";
    }
   
    
    public String getActivity() {
        System.out.println(activity+"*��ȡ�");
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    public String getPin() {
        System.out.println(pin+"*��ȡ����");
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public float getCost() {
        System.out.println(cost+"*��ȡ�ܽ��");
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public float getPercost() {
        System.out.println(per_cost+"*��ȡ�˾����");
        return per_cost;
    }
    public void setPercost(float per_cost) {
        this.per_cost = per_cost;
    }
    
    public int getPeople() {
        System.out.println(people+"*��ȡ����");
        return people;
    }
    public void setPeople(int people_num) {
        this.people = people_num;
    }
    
    public int getReal() {
        System.out.println(real_num+"*��ȡʵ������");
        return real_num;
    }
    public void setReal(int real_num) {
        this.real_num = real_num;
    }
    
    public String getName() {
        System.out.println(people_name+"*��ȡ����");
        return people_name;
    }
    public void setName(String people_name) {
        this.people_name = people_name;
    }
    
    public String getResultMsg() {
        return resultMsg;
    }
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}