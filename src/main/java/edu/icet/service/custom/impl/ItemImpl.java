package edu.icet.service.custom.impl;

import edu.icet.dto.custom.Item;
import edu.icet.service.custom.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemImpl implements ItemService {
    @Override
    public List<Item> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Item search(String s) {
        return null;
    }

    @Override
    public boolean add(Item dt) {
        return false;
    }
}
