package impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Dao;
/**
 * 
 * 本页代码包含 【select】功能
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
            
            //执行给定的 SQL 语句，该语句返回单个 ResultSet对象
            ResultSet rs = stmt.executeQuery(sql) ;
            while(rs.next()){ 
                count = rs.getInt(1);
            }
            if(rs != null){ // 关闭记录集
                try{ 
                    rs.close() ; 
                }catch(SQLException e){ 
                    e.printStackTrace() ;
                } 
            } 
            if(stmt != null){ // 关闭声明 
                try{
                    stmt.close() ; 
                }catch(SQLException e){
                    e.printStackTrace() ;
                }
            } 
            if(conn != null){ // 关闭连接对象
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
    

    //静态搜索语句
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
            if(rs != null){ // 关闭记录集
                try{ 
                    rs.close() ; 
                }catch(SQLException e){ 
                    e.printStackTrace() ;
                } 
            } 
            if(stmt != null){ // 关闭声明 
                try{
                    stmt.close() ; 
                }catch(SQLException e){
                    e.printStackTrace() ;
                }
            } 
            if(conn != null){ // 关闭连接对象
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
