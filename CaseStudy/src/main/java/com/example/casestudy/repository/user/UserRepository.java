package com.example.casestudy.repository.user;

import com.example.casestudy.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);
}
