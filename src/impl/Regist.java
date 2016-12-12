package impl;

import dmo.SQL_word;


/**
 * 
 * 实现注册相关业务
 *
 * @author Baoxuan Sunzq
 */
public class Regist {
 
    Select selectConn = new Select();
    Insert insertConn = new Insert();
    SQL_word word = new SQL_word();
    
    
    //校验业务,select
    public int findByUserName(String userName) {
        int count = selectConn.select(word.Select_User(userName));
        return count;
    }
    
    //注册业务，insert
    public int regist(String userName, String passWord) {
        int count = insertConn.save(word.Insert_User(userName, passWord));
        return count;
    }
}