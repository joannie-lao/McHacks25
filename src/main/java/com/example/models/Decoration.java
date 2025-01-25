package com.example.models;

public class Decoration {
    private String name;
    private int cost;
    private int tier;

    public Decoration(String name, int cost, int tier) {
        this.name = name;
        this.cost = cost;
        this.tier = tier;
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
