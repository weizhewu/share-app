package com.soft1851.user.controller;

import com.soft1851.user.domain.dto.UserDto;
import com.soft1851.user.domain.entity.User;
import com.soft1851.user.service.UserService;
import com.soft1851.user.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserHello {
    private final UserServiceImpl userService;
    @GetMapping(value = "/hello")
    public String getHello(){
        log.info("我被调用了");
        return "Hello,this is user-center";
    }

    @GetMapping(value = "/one/{userId}")
    public User getUserByUserId(@PathVariable int userId){
        log.info("我被调用了");
        return userService.getByUserId(userId);
    }

    @GetMapping(value = "/q")
    public User getByUser(User user){
        return user;
    }
}
