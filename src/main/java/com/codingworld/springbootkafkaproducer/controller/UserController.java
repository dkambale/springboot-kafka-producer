package com.codingworld.springbootkafkaproducer.controller;


import com.codingworld.springbootkafkaproducer.bean.User;
import com.codingworld.springbootkafkaproducer.repo.UserCRUD;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserCRUD userCRUD;

  @GetMapping("/all")
  public List<User> getAllUser() {
    List<User> users = (List<User>) userCRUD.findAll();
    return users;
  }

  @PostMapping("/save")
  public User saveUser(@RequestBody User user) {
    user = userCRUD.save(user);
    return user;
  }

}
