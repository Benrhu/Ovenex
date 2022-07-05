package com.example.Ovenex.Controllers;
import com.example.Ovenex.Entities.UserData;
import com.example.Ovenex.Repository.UserDataRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class UserDataController {

    private UserDataRepository userDataRespository;

    public UserDataController(UserDataRepository userDataRespository) {
        this.userDataRespository = userDataRespository;
    }

    @GetMapping("/UserData")
    public List<UserData> findAll() {
        return userDataRespository.findAll();
    }

    @PostMapping("/UserData")
    public UserData create(@RequestBody UserData userData) {
        return userDataRespository.save(userData);
    }

    @GetMapping("/subscribers")
    public String showAll(Model model) {
        List<UserData> UserDataList = userDataRespository.findAll();
        return null;
        // model.addAttribute("Titulo", "Lista de Suscriptores");
        // model.addAttribute("Supscriptores", UserDataList);
        // return "/templates";
    }



}
