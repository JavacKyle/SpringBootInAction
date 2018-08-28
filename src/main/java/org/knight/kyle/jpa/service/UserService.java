package org.knight.kyle.jpa.service;

import org.knight.kyle.jpa.entity.AccountInfo;

public interface UserService {
    public AccountInfo createNewAccount(String user, String pwd, Integer init);
}
