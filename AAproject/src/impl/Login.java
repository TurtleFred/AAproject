package impl;

import dmo.User;
import dmo.SQL_word;

/**
 * 
 * 实现登录相关业务
 *
 * @author Wsd
 */
public class Login {
    
    Select select = new Select();
    SQL_word word = new SQL_word();
    
    
    
    //登录业务，select
    public int login(User user) {
        int count = select.selectStatement(word.Select_User(user.getUserName(), user.getPassWord()));
        return count;
    }
}
