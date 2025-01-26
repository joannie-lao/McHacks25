package com.example.models;

public class Decoration {
    private String name;
    private int cost;
    private int tier;
    private Area area;

    public Decoration(String name, int cost, int tier, Area area) {
        this.name = name;
        this.cost = cost;
        this.tier = tier;
        this.area = area;
        area.getStore().getTieredDecorations().get(tier).add(this);
        area.addDecoration(this);
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
