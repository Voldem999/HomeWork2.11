package com.example.homework2_11.Components;

import com.example.homework2_11.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void add(List<Item> items) {
        this.items.addAll(items);
    }

    public List<Item> get() {
        return new ArrayList<>(items);
    }
}
