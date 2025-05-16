package org.example.startapplication.service;

import lombok.AllArgsConstructor;
import org.example.startapplication.annotation.TrackMethod;
import org.example.startapplication.annotation.TrackTime;
import org.example.startapplication.entity.Auto;
import org.example.startapplication.entity.User;
import org.example.startapplication.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Override
    @TrackMethod
    public User create(User user) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return userRepository.save(user);
    }

    @Override
    @TrackTime
    public List<User> getAll() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Пользователь не найден"));
    }

    @Override
    public void delete(Long id) {
        userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Пользователь не найден"));

        userRepository.deleteById(id);
    }
}
