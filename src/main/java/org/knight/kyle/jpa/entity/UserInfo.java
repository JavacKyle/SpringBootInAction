package org.knight.kyle.jpa.entity;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/8/28
 * Time: 11:31
 */
public class UserInfo {
    public String username;
    public String password;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
