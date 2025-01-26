package com.example.models;
import java.util.HashMap;

public class Inventory {
    private HashMap<Decoration,Integer> decorationInventory = new HashMap<>();
    
    public Inventory() {
    }

    public void addDecoration(Decoration decoration){
        if(decorationInventory.containsKey(decoration)){
            decorationInventory.put(decoration,decorationInventory.get(decoration)+1);
        }else{
            decorationInventory.put(decoration,1);
        }
    }
    public void getDecorationCount(Decoration decoration){
        decorationInventory.get(decoration);
    }
}
