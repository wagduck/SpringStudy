package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.annotation.TokenRequired;
import kr.re.kitri.hello.model.User;
import kr.re.kitri.hello.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

    private static Logger log = LoggerFactory.getLogger(userController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User registUser(@RequestBody User user) {

        userService.registUser(user);
        return user;
    }

    @GetMapping("/users")
    @TokenRequired
    public List<User> viewallUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User viewUserDetails(@PathVariable String userId){
        log.debug(userId + " is selected!!!!. ");
        return userService.getUserDetails(userId);
    }
}
