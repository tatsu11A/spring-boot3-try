package com.example.demo.web.master.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Item;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegistController {

    private final ItemRegistService itemRegistService;

    @GetMapping("/master/item/index")
    public String index(@ModelAttribute("form") ItemForm form) {
        return "master/item/index";
    }

    @PostMapping("/master/item/confirm")
    public String confirm(@ModelAttribute("form") ItemForm form) {
        return "master/item/confirm";
    }

    @PostMapping("/master/item/regist")
    public String regist(@ModelAttribute("form") ItemForm form) {
        Item item = form.toItem();
        itemRegistService.regist(item);
        return "redirect:/master/item/complete";
    }

    @GetMapping("/master/item/complete")
    public String complete() {
        return "master/item/complete";
    }
}