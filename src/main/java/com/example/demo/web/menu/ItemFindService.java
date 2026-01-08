package com.example.demo.web.menu;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemMapper;

@Service
public class ItemFindService {

    private final ItemMapper mapper;

    public ItemFindService(ItemMapper mapper){
        this.mapper = mapper;
    }

    public List<Item> findAllItems() {
        return mapper.findAll();
    }
}
