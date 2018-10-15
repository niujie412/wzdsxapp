package com.niu.controller;


import com.niu.dataobject.UserName;
import com.niu.service.Impl.UserNameImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class UsernameController {

    @Autowired
    private UserNameImpl service;

    @PostMapping(value = "/adduser")
    public UserName adduser(@RequestParam("userName")  String userName,
                        @RequestParam("passWord") String passWord){
        UserName userName1 = new UserName();
        userName1.setUserName(userName);
        userName1.setPassWord(passWord);
        return service.save(userName1);
    }
}
