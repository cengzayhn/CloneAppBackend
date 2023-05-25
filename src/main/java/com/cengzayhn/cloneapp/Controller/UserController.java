package com.cengzayhn.cloneapp.Controller;

import com.cengzayhn.cloneapp.Entity.Users;
import com.cengzayhn.cloneapp.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserService userService;
    @PostMapping("")
    private Users submitUser(@RequestBody Users users){
        return userService.submitDataofUser(users);
    }

    @GetMapping("/{userId}")
    private Users getUserDetails(@PathVariable("userId") String userId){
        return userService.displayUserData(userId);

    }

}
