package dmo;

/**
 * 
 * ����SQL���
 * 
 * ʹ��λ�ã�action����������
 *
 * @author Wsd
 */
public class SQL_word {

    
    //ע�����sql���
    //user���������
    public String Insert_User(String userName , String passWord) {
        String sql = "insert into user(userName,passWord) " + " values (" + "'"
                + userName + "','" + passWord + "')";
        return sql;
    }
    
    //user��������
    public String Select_User(String userName) {
        String sql = "select count(*) from user where username = " 
                + "'" + userName + "'";
        return sql;
    }
    //user���ѯ����֤���Ƿ���ϵ�¼��Ϣ
    public String Select_User(String userName , String passWord) {
        String sql = "SELECT count(*) FROM user WHERE username = " 
                + "'" + userName + "' and password = '" + passWord + "'";
        return sql;
    }
    
    //����sql���
    
    //activity�����
    public String Insert_Act(String activity , String pin , float cost , int people , String pName , float ideal_cost , float real_cost) {
        String sql = "insert into activity(activity,pin_num,cost,total_people,name) " + " values (" + "'"
                + activity + "','" + pin + "','" + cost +"','" + people + "','" +pName + "')";
        System.out.println(sql);
        return sql;
    }
    //activity��ѡ��
    public String Select_Act(String activity , String pin) {
        String sql = "SELECT count(*) FROM activity WHERE activity = " 
                + "'" + activity + "' and pin_num = '" + pin + "'";
        return sql;
    }
        
    //�����Ѳμӻ��
        //Joiner����һ��
        public String Select_Join1(String userName) {
            String sql = "SELECT count(*) FROM joiner WHERE name = " 
                    + "'" + userName  + "'";
            return sql;    
    }
        //Joiner����һ
        public String Select_Join(String userName) {
            String sql = "SELECT * FROM joiner WHERE name = " 
                    + "'" + userName  + "'";
            return sql;    
    }
        //Joiner�����
        public String Insert_Join(String activity , String name , float ideal_cost , float real_cost) {
            String sql = "insert into Joiner(activity,name,ideal_cost,real_cost) " + " values (" + "'"
                    + activity + "','" + name + "','" + ideal_cost +"','" + real_cost +  "')";
            return sql;
        }
}
