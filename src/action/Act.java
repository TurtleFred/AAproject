package action;

import java.util.Map;

import impl.Create;
import impl.Insert;
import dmo.SQL_word;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * �����
 * ʹ��Insert������������activity
 * 
 * @author Sunzq
 */
public class Act extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String activity , pName , pin , actType , payType;
    private float cost , per_cost , idealCost , realCost;
    private String realCostt;
    private int people , real_num , count;
    private String            resultMsg;
    
    Create cre = new Create();
    Insert insertConn = new Insert();
    SQL_word word = new SQL_word();
    Map<String, Object> session = ActionContext.getContext().getSession();
    
    
    
    //��Ӧ��jsp��create_act.jsp
    public String create() {
        resultMsg = null;
        //�������
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
        idealCost = payment(cost , people , payType);
        //��session,��jspҳ��
        session.put("activity", activity);
        session.put("pin", pin);
        session.put("cost", cost);
        session.put("people", people);
        session.put("idealCost",idealCost);
        session.put("actType", actType);
        System.out.println("actType is : " + session.get("actType"));
        session.put("payType", payType);
        resultMsg = "�����ɹ�";
        return "createSuccess";
    }
   
    
    
    public String createJoiner() {
        
        //idealCost = payment(cost , people , payType);
        System.out.println("activity is : " + activity);
        System.out.println("cost is : " + cost);
        System.out.println("people is : " + people);
        System.out.println("realCostt is : " + realCostt);
        System.out.println("idealCost is : " + idealCost);
        System.out.println("(pName is : " + pName);
        System.out.println("actType is : " + actType);
        System.out.println("payType is : " + payType);
        
        String[] pname = pName.split(",");
        String[] rcost = realCostt.split(",");
        
        for(int i=0;i<people;i++) {
            
            realCost = Float.parseFloat(rcost[i]);
            realCost = (float)(Math.round(realCost*100))/100;
            
            count = insertConn.save(word.Insert_Join(activity,pname[i],idealCost,realCost));
            
            System.out.println("(after i)pName is : " + pname[i]);
            System.out.println("(after i)realCost "+i+ " is : " + realCost);
        }
        resultMsg = "�����ɹ�";
        return "createJSuccess";
    }
    
    public float payment(float cost , int people , String payType) {
        float pay = 0 , rest = 0;
        pay = cost / people;
        if(payType.equals("restFree")) {
            pay = (float) Math.floor(pay);
            rest = cost - pay*people;
        }
        session.put("idealCost", pay);
        session.put("rest", rest);
        return pay;
    }
    
    
    //set get����
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
    
    public String getpName() {
        System.out.println(pName+"*��ȡ����");
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    
    public float getidealCost() {
        System.out.println(idealCost+"*��ȡi�ܽ��");
        return idealCost;
    }
    public void setidealCost(float idealCost) {
        this.idealCost = idealCost;
    }
    
    public float getRealCost() {
        System.out.println(realCost+"*��ȡr�ܽ��");
        return realCost;
    }
    public void setRealCost(float realCost) {
        System.out.println(realCost+"*���ý��");
        this.realCost = realCost;
    }
    
    public String getResultMsg() {
        return resultMsg;
    }
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
    
    public String getRealCostt() {
        System.out.println(realCost+"*��ȡr�ܽ��(s)");
        return realCostt;
    }
    public void setRealCostt(String realCostt) {
        System.out.println(realCost+"*���ý��");
        this.realCostt = realCostt;
    }
    
    public String getActType() {
        System.out.println(actType+"*��ȡ�");
        return actType;
    }
    public void setActType(String actType) {
        this.actType = actType;
    }
    
    public String getPayType() {
        System.out.println(payType+"*��ȡ�");
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
    
}