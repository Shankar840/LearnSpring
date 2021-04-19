package com.example.model;

import lombok.Data;

@Data
public class Topics {
    private int id;
    private String name;
    private String description;

    public Topics(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
