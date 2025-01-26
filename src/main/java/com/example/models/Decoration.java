package com.example.models;

import java.util.List;

public abstract class Decoration {
    private String name;
    private int cost;
    private int tier;
    private Area area;
    private GrowableBehavior growableBehavior;

    public Decoration(String name, int cost, int tier, Area area,boolean growable,List<String> stages) {
        this.name = name;
        this.cost = cost;
        this.tier = tier;
        this.area = area;
        area.getStore().getTieredDecorations().get(tier).add(this);
        area.addDecoration(this);
        if(growable){
            this.growableBehavior = new GrowableBehavior(stages);
        }
    }

    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public int getTier() {
        return tier;
    }
    
}
