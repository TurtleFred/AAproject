package action;

import java.util.Map;

import impl.Create;
import impl.Insert;
import dmo.SQL_word;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * 创建活动
 * 使用Insert插入数据至表：activity
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
    
    
    
    //对应的jsp：create_act.jsp
    public String create() {
        resultMsg = null;
        //检查输入
        if ("".equals(activity) || activity == null) {
            resultMsg = "未输入活动";
            return "checkFailure";
        } else if ("".equals(cost) || cost == 0) {
            resultMsg = "你们没有消费吗？";
            return "checkFailure";
        } else if ("".equals(people) || people == 0) {
            resultMsg = "没有人参加活动？";
            return "checkFailure";
        }
        idealCost = payment(cost , people , payType);
        //存session,传jsp页面
        session.put("activity", activity);
        session.put("pin", pin);
        session.put("cost", cost);
        session.put("people", people);
        session.put("idealCost",idealCost);
        session.put("actType", actType);
        System.out.println("actType is : " + session.get("actType"));
        session.put("payType", payType);
        resultMsg = "创建成功";
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
        resultMsg = "创建成功";
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
    
    
    //set get操作
    public String getActivity() {
        System.out.println(activity+"*获取活动");
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    public String getPin() {
        System.out.println(pin+"*获取密码");
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public float getCost() {
        System.out.println(cost+"*获取总金额");
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public float getPercost() {
        System.out.println(per_cost+"*获取人均金额");
        return per_cost;
    }
    public void setPercost(float per_cost) {
        this.per_cost = per_cost;
    }
    
    public int getPeople() {
        System.out.println(people+"*获取人数");
        return people;
    }
    public void setPeople(int people_num) {
        this.people = people_num;
    }
    
    public int getReal() {
        System.out.println(real_num+"*获取实到人数");
        return real_num;
    }
    public void setReal(int real_num) {
        this.real_num = real_num;
    }
    
    public String getpName() {
        System.out.println(pName+"*获取名字");
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    
    public float getidealCost() {
        System.out.println(idealCost+"*获取i总金额");
        return idealCost;
    }
    public void setidealCost(float idealCost) {
        this.idealCost = idealCost;
    }
    
    public float getRealCost() {
        System.out.println(realCost+"*获取r总金额");
        return realCost;
    }
    public void setRealCost(float realCost) {
        System.out.println(realCost+"*设置金额");
        this.realCost = realCost;
    }
    
    public String getResultMsg() {
        return resultMsg;
    }
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
    
    public String getRealCostt() {
        System.out.println(realCost+"*获取r总金额(s)");
        return realCostt;
    }
    public void setRealCostt(String realCostt) {
        System.out.println(realCost+"*设置金额");
        this.realCostt = realCostt;
    }
    
    public String getActType() {
        System.out.println(actType+"*获取活动");
        return actType;
    }
    public void setActType(String actType) {
        this.actType = actType;
    }
    
    public String getPayType() {
        System.out.println(payType+"*获取活动");
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
    
}