package com.example.models;

import java.util.List;

public class Area {
    private String name;
    private List<Decoration> decorations;
    private Store store;

    public List<Decoration> getDecorations(){
        return decorations;
    }
    public void addDecoration(Decoration decoration){
        decorations.add(decoration);
    }
    public Store getStore(){
        return store;
    }
}
