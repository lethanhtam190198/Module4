package com.example.casestudy.service.user;

import com.example.casestudy.model.user.MyUserDetail;
import com.example.casestudy.model.user.User;
import com.example.casestudy.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class MyUserDetailImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("username" + userName + "not found");
        }
        return new MyUserDetail(user);
    }
}
