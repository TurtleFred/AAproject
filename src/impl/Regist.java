package impl;

import dmo.SQL_word;


/**
 * 
 * ʵ��ע�����ҵ��
 *
 * @author Baoxuan Sunzq
 */
public class Regist {
 
    Select selectConn = new Select();
    Insert insertConn = new Insert();
    SQL_word word = new SQL_word();
    
    
    //У��ҵ��,select
    public int findByUserName(String userName) {
        int count = selectConn.select(word.Select_User(userName));
        return count;
    }
    
    //ע��ҵ��insert
    public int regist(String userName, String passWord) {
        int count = insertConn.save(word.Insert_User(userName, passWord));
        return count;
    }
}