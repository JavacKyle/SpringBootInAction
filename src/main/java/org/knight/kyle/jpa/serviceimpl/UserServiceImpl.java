package org.knight.kyle.jpa.serviceimpl;

import org.knight.kyle.jpa.dao.UserDao;
import org.knight.kyle.jpa.daoimpl.UserDaoImpl;
import org.knight.kyle.jpa.entity.AccountInfo;
import org.knight.kyle.jpa.entity.UserInfo;
import org.knight.kyle.jpa.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    public AccountInfo createNewAccount(String username, String password, Integer initBalance){
// 封装域对象
        AccountInfo accountInfo = new AccountInfo();
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        accountInfo.setBalance(initBalance);
        accountInfo.setUserInfo(userInfo);
// 调用持久层，完成数据的保存
        return userDao.save(accountInfo);
    }
}
