package com.example.demo.entity;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Item;

@Mapper
public interface ItemMapper {
    
    @Select("""
            select
            id,
            item_name,
            price
            from item
            order by id
            """)
            List<Item>findAll();
}