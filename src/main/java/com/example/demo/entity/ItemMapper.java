package com.example.demo.entity;

import java.utik.List;

import org.apache.ibatis.annotaitions.Mapper;
import org.apache.ibatis.annotaitions.Select;

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