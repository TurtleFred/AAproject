package impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Dao;
/**
 * 
 * ��ҳ������� ��select������
 *
 * @author Wsd Sunzq Baoxuan
 */
public class Select {
                
    
    public int select(String sql) {
        int count=0;
        try {
            Dao db = new Dao();
            Connection conn = db.getConn();
            Statement stmt = conn.createStatement() ;
            
            //ִ�и����� SQL ��䣬����䷵�ص��� ResultSet����
            ResultSet rs = stmt.executeQuery(sql) ;
            while(rs.next()){ 
                count = rs.getInt(1);
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
        return count;
    }
    

    //��̬�������
    public int selectStatement(String sql) {
        System.out.println(sql);
        int count=0;
        try {
            Dao db = new Dao();
            Connection conn = db.getConn();
            Statement stmt = conn.createStatement() ;
            ResultSet rs = stmt.executeQuery(sql) ;
            while(rs.next()){ 
                count = rs.getInt(1);
                
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
        return count;
    }
}
