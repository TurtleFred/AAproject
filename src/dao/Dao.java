package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * 数据库连接
 *
 *
 * @author Wsd
 */
public class Dao {
    
    private Connection conn;
    /**
     * 连接数据库
     * @return
     */
    public Connection getConn(){
        //连接数据库
        String url = "jdbc:mysql://localhost:3306/aaproject" , ex_url="?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    //  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_vote", "root", "12345678");
        //数据库的用户，密码
        String USER = "root" , PIN = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver"); // 加载驱动
            conn = DriverManager.getConnection(url+ex_url, USER, PIN);// 注册驱动程序
            if (!conn.isClosed()) {
                System.out.println("连接成功");
            }
            if (conn == null) {
                System.out.println("连接数据库失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("error!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error!");
        }
        return conn;
    }
    
    //关闭数据库连接
    public void closeConn(){
        if(conn!=null) {
            try{
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("error!");
            }
        }
    }
}