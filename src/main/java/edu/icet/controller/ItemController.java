package edu.icet.controller;

import edu.icet.dto.custom.Item;
import edu.icet.service.custom.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ItemController {
    @Autowired
    ItemService itemService;
    public List<Item> getAllItems(){
        return new ArrayList<>();
    }
}
