package com.se.houseBuild.controllers;


import com.se.houseBuild.model.House;
import com.se.houseBuild.service.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@Controller // This means that this class is a Controller
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private HouseRepository houseRepository;

//
//    @GetMapping()
//    public @ResponseBody Iterable<House> getAllUsers() {
////        houseRepository.save(new House("Каркасный дом Адмирал", 205 ,
////                5, 2, "Классический", 6149000));
//        return houseRepository.findAll();
//    }


    @GetMapping()
    public String catalog(Model model){
                houseRepository.save(new House("Каркасный дом Адмирал", 205 ,
                5, 2, "Классический", 6149000));
        Iterable<House> a =  houseRepository.findAll();
        model.addAttribute("houses", houseRepository.findAll());
        return "catalog";
    }


    @GetMapping("/house/{house_id}/edit")
    public String edit(@PathVariable("house_id") Integer id,
                       Model model) {

        model.addAttribute("home", houseRepository.findById(id).get());
        return "housePage";
    }




}