package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.entitiy.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user", new UserDTO());
        List<Ro>
        model.addAttribute("roles", new  )

        return "/user/create";

    }


}
