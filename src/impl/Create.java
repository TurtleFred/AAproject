package impl;

import dmo.SQL_word;


/**
 * 
 * 创建活动
 *
 * @author Sunzq
 */
public class Create {
 
    Select selectConn = new Select();
    Insert insertConn = new Insert();
    SQL_word word = new SQL_word();
    
    
    //创建，insert
    public int create(String activity , String pin , float cost , int people , String people_name , float ideal_cost , float real_cost) {
        int count = insertConn.save(word.Insert_Act(activity,pin,cost,people,people_name));
        System.out.println("create in package impl , Create.java");
        return count;
    }
}