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

    private String activity , pName , pin;
    private float cost , per_cost , ideal_cost , realCost;
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
        //因为只需要添加一个活动，所以暂不需要用数组存，直接赋值即可
        //insertConn.save(word.Insert_Act(activity,pin,cost,people,pName));
        //count = insertConn.save(word.Insert_Join(activity,pName,ideal_cost,real_cost));
        //存session,传jsp页面
        session.put("activity", activity);
        session.put("pin", pin);
        session.put("cost", cost);
        session.put("people", people);
        resultMsg = "创建成功";
        return "createSuccess";
    }
   
    public String createJoiner() {
        
        //因为只需要添加一个活动，所以暂不需要用数组存，直接赋值即可
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
        //存session,传jsp页面
        session.put("activity", activity);
        session.put("pin", pin);
        session.put("cost", cost);
        session.put("people", people);
        session.put("ideal_cost", ideal_cost);
        
        resultMsg = "创建成功";
        return "createJSuccess";
    }
    
    
    //set get操作
    public String getActivity() {
        System.out.println(activity+"*获取活动1");
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    public String getPin() {
        System.out.println(pin+"*获取密码1");
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public float getCost() {
        System.out.println(cost+"*获取总金额1");
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public float getPercost() {
        System.out.println(per_cost+"*获取人均金额1");
        return per_cost;
    }
    public void setPercost(float per_cost) {
        this.per_cost = per_cost;
    }
    
    public int getPeople() {
        System.out.println(people+"*获取人数1");
        return people;
    }
    public void setPeople(int people_num) {
        this.people = people_num;
    }
    
    public int getReal() {
        System.out.println(real_num+"*获取实到人数1");
        return real_num;
    }
    public void setReal(int real_num) {
        this.real_num = real_num;
    }
    
    public String getpName() {
        System.out.println(pName+"*获取名字1");
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    
    public float getIdeal_cost() {
        System.out.println(ideal_cost+"*获取总金额1");
        return ideal_cost;
    }
    public void setIdeal_cost(float ideal_cost) {
        this.ideal_cost = ideal_cost;
    }
    
    public float getRealCost() {
        System.out.println(realCost+"*获取总金额1");
        return realCost;
    }
    public void setRealCost(float realCost) {
        System.out.println(realCost+"*设置金额1");
        this.realCost = realCost;
    }
    
    public String getResultMsg() {
        return resultMsg;
    }
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}