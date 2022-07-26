package com.example.book.service.impl;

import com.example.book.model.User;
import com.example.book.repository.IUserRepository;
import com.example.book.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByCode(int code) {
        return userRepository.findByCode(code);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
