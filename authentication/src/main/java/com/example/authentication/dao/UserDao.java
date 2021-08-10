package com.example.authentication.dao;

import com.example.authentication.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Long> {
    public User findUserByUsername(String username);
}
