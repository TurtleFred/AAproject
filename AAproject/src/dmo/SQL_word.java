package dmo;


public class SQL_word {

    
    //注册相关sql语句
    public String Insert_User(String userName , String passWord) {
        String sql = "insert into user(userName,passWord) " + " values (" + "'"
                + userName + "','" + passWord + "')";
        return sql;
    }
    
    public String Select_User(String userName) {
        String sql = "select count(*) from user where username = " 
                + "'" + userName + "'";
        return sql;
    }
    
    public String Select_User(String userName , String passWord) {
        String sql = "SELECT count(*) FROM user WHERE username = " 
                + "'" + userName + "' and password = '" + passWord + "'";
        return sql;
    }
    
    
    
    //活动相关sql语句
    public String Insert_Act(String activity , String pin , float cost , int people) {
        String sql = "insert into activity(activity,pin_num,cost,total_people) " + " values (" + "'"
                + activity + "','" + pin + "','" + cost +"','" + people + "')";
        return sql;
    }
    
    public String Select_Act(String activity , String pin , float cost , int people) {
        String sql = "SELECT count(*) FROM activity WHERE activity = " 
                + "'" + activity + "' and pin_num = '" + pin + "'";
        return sql;
    }
}
