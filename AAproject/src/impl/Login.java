package impl;

import dmo.User;
import dmo.SQL_word;

/**
 * 
 * ʵ�ֵ�¼���ҵ��
 *
 * @author Wsd
 */
public class Login {
    
    Select select = new Select();
    SQL_word word = new SQL_word();
    
    
    
    //��¼ҵ��select
    public int login(User user) {
        int count = select.selectStatement(word.Select_User(user.getUserName(), user.getPassWord()));
        return count;
    }
}
