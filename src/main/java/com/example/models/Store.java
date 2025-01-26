package com.example.models;

import java.util.HashMap;
import java.util.List;

public class Store {
    private List<Decoration> decorations;
    private Area area;
    private HashMap<Integer,List<Decoration>> tieredDecorations;

    public Store(List<Decoration> decorations, Area area) {
        this.decorations = decorations;
        this.area = area;

    }
    public List<Decoration> getDecorations() {
        return decorations;
    }
    public Area getArea() {
        return area;
    }
    public HashMap<Integer,List<Decoration>> getTieredDecorations() {
        return tieredDecorations;
    }

}
