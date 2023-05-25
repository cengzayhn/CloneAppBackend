package com.cengzayhn.cloneapp.Service;

import com.cengzayhn.cloneapp.Entity.Users;
import com.cengzayhn.cloneapp.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Users submitDataofUser(Users user){
        return userRepository.save(user);
    }
    public Users displayUserData(String userId){
        return userRepository.findByUserId(userId);
    }
}
