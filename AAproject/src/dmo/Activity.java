package dmo;

/**
 * 
 * �û���Ϣ
 *
 * @author Sunzq
 */
public class Activity {
   
    private String activity , people_name , pin;
    private float cost , per_cost;
    private int people_num , real_num;

    
    public Activity() {
        
    }
    public Activity(String userName,String passWord) {
        this.activity=activity;
        this.pin=pin;
        this.cost=cost;
        this.people_num=people_num;
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
        System.out.println(people_num+"*��ȡ����");
        return people_num;
    }
    public void setPeople(int people_num) {
        this.people_num = people_num;
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

}