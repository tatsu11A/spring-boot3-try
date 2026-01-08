package com.example.demo.web.master.item;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/master/item")
public class RegistController {

    @GetMapping("/index")
    public String index() {
        return "master/item/index";
    }

    @PostMapping("/confirm")
    public String confirm(ItemForm form, Model model){
        model.addAttribute("form" , form);
        return "master/item/confirm";
    }
}