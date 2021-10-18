package com.kondratyev.redis.controllers;

import com.kondratyev.redis.model.User;
import com.kondratyev.redis.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/add/{id}/{name}")
    public User add(@PathVariable("id") final String id,
                    @PathVariable("name") final String name) {
        userRepository.save(new User(id, name, 20000L));
        return userRepository.findById(id).orElseThrow();
    }

    @GetMapping("/update/{id}/{name}")
    public User update(@PathVariable("id") final String id,
                    @PathVariable("name") final String name) {
        userRepository.save(new User(id, name, 1000L));
        return userRepository.findById(id).orElseThrow();
    }

    @GetMapping("/delete/{id}")
    public Iterable<User> delete(@PathVariable("id") final String id) {
        userRepository.deleteById(id);
        return findAll();
    }

    @GetMapping("/all")
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/delete/all")
    public Iterable<User> deleteAll() {
        userRepository.deleteAll();
        return userRepository.findAll();
    }

}
