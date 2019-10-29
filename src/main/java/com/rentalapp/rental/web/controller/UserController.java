package com.rentalapp.rental.web.controller;

import com.rentalapp.rental.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    private RestTemplate restTemplate = new RestTemplate();


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public User[] ListUsers() {
        User[] response = restTemplate.getForObject("http://172.22.119.130:8080/users",User[].class);
        return response;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User afficherUnUser(@PathVariable int id) {
        User user = restTemplate.getForObject(("http://172.22.119.130:8080/users/"+id), User.class);
        return user;
    }

    @RequestMapping(value = {"/users/{id}"}, method = RequestMethod.DELETE)
    public String supprimerUser(@PathVariable int id){
        restTemplate.delete("http://172.22.119.130:8080/users/"+id);
        return "redirect:/users";
    }


    @RequestMapping(value = {"/addUser"}, method = RequestMethod.POST)
    public String postUser(@RequestBody User user) {

        restTemplate.postForObject("http://172.22.119.130:8080/users",user,User[].class);
        return "addUser";
    }

    @RequestMapping(value = {"/addUser"}, method = RequestMethod.PUT)
    public String updateUser(@RequestBody User user) {

        restTemplate.postForObject("http://172.22.119.130:8080/users", user,User[].class);
        return "addUser";
    }
}
