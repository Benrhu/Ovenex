package com.example.Ovenex.Controllers;
import com.example.Ovenex.Entities.UserData;
import com.example.Ovenex.Repository.UserDataRepository;
import com.example.Ovenex.Services.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserDataController {

    @Autowired
    UserDataService userDataService;

    public UserDataController(UserDataRepository userDataRepository, UserDataService userDataService) {
        this.userDataService = userDataService;
    }

    @GetMapping("/UserData")
    public UserData findAll() {
        return (UserData) userDataService.findAll();
    }

    @GetMapping("/UserData/ById")
    public Optional<UserData> findById() {
        return userDataService.findByOvenId();
    }

}
