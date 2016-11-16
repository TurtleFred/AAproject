package impl;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Dao;

/**
 * 
 * 本页代码包含 【insert】功能
 * 
 * @author Wsd
 */
public class Insert {
    
    public int save(String sql) {
        int count = 0;
        try {
            Dao db = new Dao();
            Connection conn = db.getConn();        
            // 执行静态SQL语句
            Statement stmt = conn.createStatement();

            
            count = stmt.executeUpdate(sql);
            if (stmt != null) { // 关闭声明
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) { // 关闭连接对象
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            db.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
