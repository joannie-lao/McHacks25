package com.example.models;

import java.util.List;

public abstract class Decoration {
    private String name;
    private int cost;
    private int tier;
    private Area area;
    private GrowableBehavior growableBehavior;
    private AnimatedBehavior animatedBehavior;

    public Decoration(String name, int cost, int tier, Area area,boolean growable,List<String> stages,boolean animated,List<String> frames) {
        this.name = name;
        this.cost = cost;
        this.tier = tier;
        this.area = area;
        area.getStore().getTieredDecorations().get(tier).add(this);
        area.addDecoration(this);
        if(growable){
            this.growableBehavior = new GrowableBehavior(stages);
        }
        if(animated){
            this.animatedBehavior = new AnimatedBehavior(frames);
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
    public boolean isGrowable(){
        return growableBehavior != null;
    }
    public boolean isAnimated(){
        return animatedBehavior != null;
    }
    public GrowableBehavior getGrowableBehavior(){
        return growableBehavior;
    }
    public AnimatedBehavior getAnimatedBehavior(){
        return animatedBehavior;
    }
    
    
}
