package impl;

import dmo.SQL_word;


/**
 * 
 * �����
 *
 * @author Sunzq
 */
public class Create {
 
    Select selectConn = new Select();
    Insert insertConn = new Insert();
    SQL_word word = new SQL_word();
    
    
    //������insert
    public int create(String activity , String pin , float cost , int people) {
        int count = insertConn.save(word.Insert_Act(activity,pin,cost,people));
        return count;
    }
}