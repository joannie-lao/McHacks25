package com.example.models;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Scene;

public class Area {
    private String name;
    private List<Decoration> decorations;
    private Store store;
    private boolean isUnlocked;
    private String unlockRequirements;

    public Area(String name) {
        this.name = name;
        this.isUnlocked = false;
        this.decorations = new ArrayList<>();
    }

    public List<Decoration> getDecorations(){
        return decorations;
    }
    public void addDecoration(Decoration decoration){
        decorations.add(decoration);
    }
    public Store getStore(){
        return store;
    }
    public void unlock(){
        isUnlocked = true;
    }
    public boolean isUnlocked(){
        return isUnlocked;
    }
}
