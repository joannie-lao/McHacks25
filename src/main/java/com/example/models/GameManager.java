package com.example.models;

import java.util.List;

public class GameManager {
    private User user;
    private List<Area> areas;
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
    
    
}
