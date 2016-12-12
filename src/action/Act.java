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

    private String activity , pName , pin;
    private float cost , per_cost , ideal_cost , realCost;
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
        //��Ϊֻ��Ҫ���һ����������ݲ���Ҫ������棬ֱ�Ӹ�ֵ����
        //insertConn.save(word.Insert_Act(activity,pin,cost,people,pName));
        //count = insertConn.save(word.Insert_Join(activity,pName,ideal_cost,real_cost));
        //��session,��jspҳ��
        session.put("activity", activity);
        session.put("pin", pin);
        session.put("cost", cost);
        session.put("people", people);
        resultMsg = "�����ɹ�";
        return "createSuccess";
    }
   
    public String createJoiner() {
        
        //��Ϊֻ��Ҫ���һ����������ݲ���Ҫ������棬ֱ�Ӹ�ֵ����
        //count = insertConn.save(word.Insert_Act(activity,pin,cost,people,pName));
        System.out.println("(before i)activity is : " + activity);
        System.out.println("(before i)cost is : " + cost);
        System.out.println("(before i)people is : " + people);
        System.out.println("(before i)realCost is : " + realCost);
        System.out.println("(before i)pName is : " + pName);
        String[] s = pName.split(",");
        for(int i=0;i<people;i++) {
            System.out.println("get into i");
        count = insertConn.save(word.Insert_Join(activity,s[i],ideal_cost,realCost));
        System.out.println("(after i)pName is : " + s[i]);
//        session.put("pName", s[i]);
//        session.put("real_cost", real_cost);
        }
        //��session,��jspҳ��
        session.put("activity", activity);
        session.put("pin", pin);
        session.put("cost", cost);
        session.put("people", people);
        session.put("ideal_cost", ideal_cost);
        
        resultMsg = "�����ɹ�";
        return "createJSuccess";
    }
    
    
    //set get����
    public String getActivity() {
        System.out.println(activity+"*��ȡ�1");
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    public String getPin() {
        System.out.println(pin+"*��ȡ����1");
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public float getCost() {
        System.out.println(cost+"*��ȡ�ܽ��1");
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public float getPercost() {
        System.out.println(per_cost+"*��ȡ�˾����1");
        return per_cost;
    }
    public void setPercost(float per_cost) {
        this.per_cost = per_cost;
    }
    
    public int getPeople() {
        System.out.println(people+"*��ȡ����1");
        return people;
    }
    public void setPeople(int people_num) {
        this.people = people_num;
    }
    
    public int getReal() {
        System.out.println(real_num+"*��ȡʵ������1");
        return real_num;
    }
    public void setReal(int real_num) {
        this.real_num = real_num;
    }
    
    public String getpName() {
        System.out.println(pName+"*��ȡ����1");
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    
    public float getIdeal_cost() {
        System.out.println(ideal_cost+"*��ȡ�ܽ��1");
        return ideal_cost;
    }
    public void setIdeal_cost(float ideal_cost) {
        this.ideal_cost = ideal_cost;
    }
    
    public float getRealCost() {
        System.out.println(realCost+"*��ȡ�ܽ��1");
        return realCost;
    }
    public void setRealCost(float realCost) {
        System.out.println(realCost+"*���ý��1");
        this.realCost = realCost;
    }
    
    public String getResultMsg() {
        return resultMsg;
    }
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}