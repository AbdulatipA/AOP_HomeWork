package org.example.startapplication.service;

import org.example.startapplication.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);
    List<User> getAll();
    User getById(Long id);
    void delete(Long id);
}
