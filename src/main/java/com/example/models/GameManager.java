package com.example.models;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.example.util.ContentLoader;

public class GameManager {
    private User user;
    private List<Area> areas;
    private List<Decoration> decorations;
    private static GameManager instance;
    public GameManager() {
        this.user = new User();
        loadGame();
    }
    public void saveGame() {
        // Save the game
        
    }
    public void loadGame() {
        // Load the game
        this.areas = ContentLoader.loadAreas("src/main/resources/data/areas.json");
        this.decorations = ContentLoader.loadDecorations("src/main/resources/data/decorations.json");
        if (this.decorations == null || this.decorations.isEmpty()) {
            System.err.println("Failed to load decorations.");
        } else {
            System.out.println("Loaded " + this.decorations.size() + " decorations.");
        }
        this.user.addHabit(new Habit("test", 2, TimeUnit.DAYS, 0));
        this.user.addHabit(new Habit("test2", 3, TimeUnit.DAYS, 0));
    }
    public User getUser(){
        return user;
    }
    public static GameManager getInstance(){
        if(instance == null){
            instance = new GameManager();
        }
        return instance;
    }
    public List<Area> getAreas(){
        return areas;
    }

    
    
}
