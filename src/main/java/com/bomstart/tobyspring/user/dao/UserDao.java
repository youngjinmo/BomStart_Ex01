package com.bomstart.tobyspring.user.dao;

import com.bomstart.tobyspring.user.domain.User;

import java.util.List;

public interface UserDao {
    public User selectUser(String id);
    public List<User> selectUsers();
    public void createUser(User user);
    public void updateUser(User user);
    public void deleteUser(String id);
}
