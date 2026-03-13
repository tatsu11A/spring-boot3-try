package com.example.demo.web.master.item;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Item;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/master/item")
@RequiredArgsConstructor
public class RegistController {

    private final ItemRegistService itemRegistService;

    @GetMapping("/index")
    public String index(@ModelAttribute("form") ItemForm form) {
        return "master/item/index";
    }

    @PostMapping("/confirm")
    public String confirm(@ModelAttribute("form") ItemForm form) {
        return "master/item/confirm";
    }

    @PostMapping("/regist")
    public String regist(@ModelAttribute("form") ItemForm form) {
        Item item = form.toItem();
        itemRegistService.regist(item);
        return "/master/item/complete";
    }

    @GetMapping("/complete")
    public String complete() {
        return "master/item/complete";
    }
}