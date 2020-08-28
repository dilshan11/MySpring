package com.example.demo1.Service;

import com.example.demo1.Dao.ItemDao;
import com.example.demo1.Entity.Item;
import com.example.demo1.Repositery.ItemRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    //getAllItem
    //getItem
    //addItem
    //updateItem
    //deleteItem
    @Autowired
    private ItemRepositery itemRepositery;

    public List<ItemDao> getAllItem(){
        List<ItemDao> itemDaoList= new ArrayList<>();
        List<Item> itemList=this.itemRepositery.findAll();
        for(Item item:itemList){
           ItemDao itemDao=new ItemDao(item.getId(),item.getName(),item.getQty());
           itemDaoList.add(itemDao);
        }
        return itemDaoList;
    }

    public ItemDao getItem(int id){
        Optional<Item> itemOptional =this.itemRepositery.findById(id);
        Item item=itemOptional.get();
        if(itemOptional.isPresent()){
            ItemDao itemDao=new ItemDao(item.getId(),item.getName(),item.getQty());
            return itemDao;
        }
        else{
            ItemDao itemDao=new ItemDao(1,null,0);
            return itemDao;
        }
    }

    public void addItem(ItemDao itemDao){
        Item item=new Item(itemDao.getName(),itemDao.getQty());

        this.itemRepositery.save(item);
    }

    public void updateItem(ItemDao itemDao){
        Item item=new Item(itemDao.getName(),itemDao.getQty());
        item.setId(itemDao.getId());
        this.itemRepositery.save(item);
    }

    public void deleteItem(@PathVariable int id){
        this.itemRepositery.deleteById(id);
    }
}
