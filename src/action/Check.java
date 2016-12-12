package action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Map;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import dmo.SQL_word;
import dmo.Joiner;

//import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.Dao;

/**
 * 
 * ��ҳ������� ��search������
 * ʹ�����ݿ��Joiner
 * ���ܣ���ѯ�Ѳμӻ(unfinish)
 * 
 * @author Wsd
 */
public class Check extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String  activity;
    private float ideal_cost , real_cost , pay;
SQL_word word = new SQL_word();
    
    //��arraylist������ݿ��ȡ����Ϣ
    public ArrayList<Joiner> selectact(String sql) {
        ArrayList<Joiner> list = new ArrayList<Joiner>();
        System.out.println(sql);
//        int count=0;
        try {
            //�������ݿ�
            Dao db = new Dao();
            Connection conn = db.getConn();
            Statement stmt = conn.createStatement() ;
            ResultSet rs = stmt.executeQuery(sql) ;
            while(rs.next()){ 
//                count = rs.getInt(1);
                //���ݴ�joiner��
                Joiner jo=new Joiner();
                jo.setActivity(rs.getString("activity"));
                jo.setIdeal(rs.getFloat("ideal_cost"));
                System.out.println("ideal1:" + jo.getIdeal());
                jo.setReal(rs.getFloat("real_cost"));
                System.out.println("real" + jo.getReal());
                pay = jo.getReal() - jo.getIdeal();
                jo.setPay(pay);
                //��arraylist���Ԫ�أ�joiner
                list.add(jo);
            }
            if(rs != null){ // �رռ�¼��
                try{ 
                    rs.close() ; 
                }catch(SQLException e){ 
                    e.printStackTrace() ;
                } 
            } 
            if(stmt != null){ // �ر����� 
                try{
                    stmt.close() ; 
                }catch(SQLException e){
                    e.printStackTrace() ;
                }
            } 
            if(conn != null){ // �ر����Ӷ���
                try{
                    conn.close() ;
                }catch(SQLException e){ 
                    e.printStackTrace() ; 
                }
            }
            db.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //��Ӧjsp:check_act.jsp
    public String check_act() {
        
        //��������jsp�����ݣ�userName
        HttpSession session = ServletActionContext.getRequest().getSession();
        String username=(String)session.getAttribute("userName");
        System.out.println(username+"*1");
        //��arraylist����
        ArrayList<Joiner> list = selectact(word.Select_Join(username));
        session.setAttribute("size",list.size());
        System.out.println("size:"+session.getAttribute("size"));
        for (int i = 0; i < list.size(); i++) { 
            //����session��
            setActivity(list.get(i).getActivity());
            session.setAttribute("activity"+i,activity);
            setPay(list.get(i).getPay());
            session.setAttribute("pay"+i,pay);
            System.out.println(list.get(i));
            System.out.println("get activity:"+list.get(i).getActivity());
            System.out.println("Session:" + session.getAttribute("activity"+i));
            System.out.println(list.get(i).getPay());
            
        }
//        String act=(String)session.getAttribute("activity0"+"*2");
//        System.out.println(act);
        return "checkSuccess";
    }
   
    //get & set
    public String getActivity() {
        System.out.println(activity+"*��ȡ�");
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    
//    public String getResultMsg() {
//        return resultMsg;
//    }
//    public void setResultMsg(String resultMsg) {
//        this.resultMsg = resultMsg;
//    }
    
    public float getIdeal() {
        System.out.println(activity+"*��ȡ�");
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