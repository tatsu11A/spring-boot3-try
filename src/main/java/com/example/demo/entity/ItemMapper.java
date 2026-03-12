package com.example.demo.entity;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItemMapper {
    
    @Select("select * from item")
    List<Item> findAll();

    @Insert("insert into item(item_id, item_name, price) values(#{itemid}, #{itemName}, #{price})")
    void insert(Item item);
}