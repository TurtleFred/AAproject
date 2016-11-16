package impl;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Dao;

/**
 * 
 * ��ҳ������� ��insert������
 * 
 * @author Wsd
 */
public class Insert {
    
    public int save(String sql) {
        int count = 0;
        try {
            Dao db = new Dao();
            Connection conn = db.getConn();        
            // ִ�о�̬SQL���
            Statement stmt = conn.createStatement();

            
            count = stmt.executeUpdate(sql);
            if (stmt != null) { // �ر�����
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) { // �ر����Ӷ���
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
