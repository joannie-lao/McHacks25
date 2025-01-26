package com.example.models;

public class GameManager {
    private User user;
    public GameManager(User user) {
        this.user = user;
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
    
    
}
