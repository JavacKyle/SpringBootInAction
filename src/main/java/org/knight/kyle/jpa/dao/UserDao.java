package org.knight.kyle.jpa.dao;

import org.knight.kyle.jpa.entity.AccountInfo;

public interface UserDao {
    public AccountInfo save(AccountInfo accountInfo);
}
