package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * ���ݿ�����
 *
 *
 * @author Wsd
 */
public class Dao {
    
    private Connection conn;
    /**
     * �������ݿ�
     * @return
     */
    public Connection getConn(){
        //�������ݿ�
        String url = "jdbc:mysql://localhost:3306/aaproject" , ex_url="?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    //  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_vote", "root", "12345678");
        //���ݿ���û�������
        String USER = "root" , PIN = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver"); // ��������
            conn = DriverManager.getConnection(url+ex_url, USER, PIN);// ע����������
            if (!conn.isClosed()) {
                System.out.println("���ӳɹ�");
            }
            if (conn == null) {
                System.out.println("�������ݿ�ʧ��");
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
    
    //�ر����ݿ�����
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