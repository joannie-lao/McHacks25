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
    public void removeDecoration(Decoration decoration){
        if(decorationInventory.containsKey(decoration)){
            if(decorationInventory.get(decoration) > 1){
                decorationInventory.put(decoration,decorationInventory.get(decoration)-1);
            }else{
                decorationInventory.remove(decoration);
            }
        }
    }
    public HashMap<Decoration,Integer> getDecorationInventory(){
        return decorationInventory;
    }
    public void placeDecoration(Decoration decoration, Area area){
        if(decorationInventory.containsKey(decoration)){
            area.addDecoration(decoration);
            removeDecoration(decoration);
        }
    }
}
