package dmo;

/**
 * 
 * 创建SQL语句
 * 
 * 使用位置：action包下所有类
 *
 * @author Wsd
 */
public class SQL_word {

    
    //注册相关sql语句
    //user表插入数据
    public String Insert_User(String userName , String passWord) {
        String sql = "insert into user(userName,passWord) " + " values (" + "'"
                + userName + "','" + passWord + "')";
        return sql;
    }
    
    //user表按名搜索
    public String Select_User(String userName) {
        String sql = "select count(*) from user where username = " 
                + "'" + userName + "'";
        return sql;
    }
    //user表查询（验证）是否符合登录信息
    public String Select_User(String userName , String passWord) {
        String sql = "SELECT count(*) FROM user WHERE username = " 
                + "'" + userName + "' and password = '" + passWord + "'";
        return sql;
    }
    
    //活动相关sql语句
    
    //activity表插入活动
    public String Insert_Act(String activity , String pin , float cost , int people , String pName , float ideal_cost , float real_cost) {
        String sql = "insert into activity(activity,pin_num,cost,total_people,name) " + " values (" + "'"
                + activity + "','" + pin + "','" + cost +"','" + people + "','" +pName + "')";
        System.out.println(sql);
        return sql;
    }
    //activity表选择活动
    public String Select_Act(String activity , String pin) {
        String sql = "SELECT count(*) FROM activity WHERE activity = " 
                + "'" + activity + "' and pin_num = '" + pin + "'";
        return sql;
    }
        
    //查找已参加活动表
        //Joiner表查找活动数
        public String Select_Join1(String userName) {
            String sql = "SELECT count(*) FROM joiner WHERE name = " 
                    + "'" + userName  + "'";
            return sql;    
    }
        //Joiner表查找活动
        public String Select_Join(String userName) {
            String sql = "SELECT * FROM joiner WHERE name = " 
                    + "'" + userName  + "'";
            return sql;    
    }
        //Joiner表插入
        public String Insert_Join(String activity , String name , float ideal_cost , float real_cost) {
            String sql = "insert into Joiner(activity,name,ideal_cost,real_cost) " + " values (" + "'"
                    + activity + "','" + name + "','" + ideal_cost +"','" + real_cost +  "')";
            return sql;
        }
}
