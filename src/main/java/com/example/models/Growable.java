package com.example.models;

import java.util.List;

public class Growable extends Decoration{

    public Growable(String name, int cost, int tier, Area area) {
        super(name, cost, tier, area);
        //TODO Auto-generated constructor stub
    }
    
    private int growthStage;
    private List<String> growthStages;
    private boolean frozen;
    private int growthSates;
    
    
}
