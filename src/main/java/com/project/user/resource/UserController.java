package com.project.user.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.Bean.Users;

@RestController
@RequestMapping("v1/user")
public class UserController
{

    @GetMapping("/list")
    public String getUsers()
    {
    	return "Users API called";
    }

}