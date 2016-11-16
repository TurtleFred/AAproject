package dmo;



/**
 * 
 * Joiner类
 * 用于存储从数据库读取的信息
 * 使用位置：Check.java
 *
 * @author Wsd Sunzq
 */
public class Joiner {
    
    String activity , userName;
    float ideal_cost , real_cost , pay;
    
    public Joiner() {
    }
    
    public Joiner( String activity , String userName , float ideal_cost , float real_cost) {
        this.activity=activity;
        this.userName=userName;
        this.ideal_cost=ideal_cost;
        this.real_cost=real_cost;
        float pay = real_cost - ideal_cost;
        this.pay=pay;
        //添加入表中
    }
    
    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    public String getuserName() {
        return activity;
    }
    public void setuserName(String userName) {
        this.userName=userName;
    }
    
    public float getIdeal() {
        return ideal_cost;
    }
    public void setIdeal(float ideal_cost) {
        this.ideal_cost=ideal_cost;
    }
    
    public float getReal() {
        return real_cost;
    }
    public void setReal(float real_cost) {
        this.real_cost=real_cost;
    }
    
    public float getPay() {
        return pay;
    }
    public void setPay(float pay) {
        this.pay=pay;
    }
}
