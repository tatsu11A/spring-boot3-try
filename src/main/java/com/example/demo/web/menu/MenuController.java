package com.example.demo.web.menu;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemFindService;

@Controller
public class MenuController {

    private final ItemFindService Service;

    public MenuController(ItemFindService Service){
        this.service = service;
    }

    @GetMapping
    public String rooString(){
        return "redirect:/menu";
    }

    
    @GetMapping("/")
    public String menu(Model model){
        List<Item> list = service.findAllItems();
        model.addAttribute("itemList" , list);
        return "menu";
    }
}


