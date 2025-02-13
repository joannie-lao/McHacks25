package com.example.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private int coins;
    private List<Habit> habits;
    private Set<Decoration> unlockedDecorations;
    private List<Area> unlockedAreas;
    private String difficulty;
    private HashMap<Integer,Triple<Integer,Integer,Integer>> difficultyMap = new HashMap<Integer,Triple<Integer,Integer,Integer>>();
    private int habitsAllowed;
    private int maxStreak;
    private Inventory inventory;

    public User() {
        this.coins = 0;
        this.habits = new ArrayList<Habit>();
        this.unlockedDecorations = new HashSet<Decoration>();
        this.unlockedAreas = new ArrayList<Area>();
        this.maxStreak = 0;
        this.difficultyMap = new HashMap<Integer,Triple<Integer,Integer,Integer>>();
        difficultyMap.put(1, new Triple<Integer,Integer,Integer>(1,2,3));
        difficultyMap.put(2, new Triple<Integer,Integer,Integer>(2,3,4));
        difficultyMap.put(3, new Triple<Integer,Integer,Integer>(3,4,5));
        difficultyMap.put(4, new Triple<Integer,Integer,Integer>(4,5,6));
        difficultyMap.put(5, new Triple<Integer,Integer,Integer>(5,6,7));
        difficultyMap.put(6, new Triple<Integer,Integer,Integer>(6,7,8));
        difficultyMap.put(7, new Triple<Integer,Integer,Integer>(7,8,9));
        difficultyMap.put(8, new Triple<Integer,Integer,Integer>(8,9,10));
        habitsAllowed = 5;
        this.habits = new ArrayList<Habit>();
        this.inventory = new Inventory();
    }
    public int getHabitsRemaining(){
        return habitsAllowed - habits.size();
    }
    public void increaseHabitsAllowed(int i){
        habitsAllowed += habitsAllowed + i;
    }

    public void addHabit(Habit habit){
        habits.add(habit);
    }
    public void deleteHabit(Habit habit){
        habits.remove(habit);
    }
    public void completeHabit(Habit habit){
        habit.isCompleted();
        Integer habitDifficulty = habit.getDifficulty();
        if(difficulty.equals("easy")){
            coins += habit.calculateCoins(difficultyMap.get(habitDifficulty).getFirst());
        }
        else if(difficulty.equals("medium")){
            coins += difficultyMap.get(habitDifficulty).getSecond();
        }
        else if(difficulty.equals("hard")){
        coins += difficultyMap.get(habitDifficulty).getThird();
        }

    }
    
    public void setDifficulty(){
    }
    public void spendCoins(int cost){
        coins -= cost;
    }
    public int getMaxStreak(){
        return maxStreak;
    }
    public void updateMaxStreak(int streak){
        if(streak > maxStreak){
            maxStreak = streak;
        }
    }
    public List<Habit> getHabits(){
        return habits;
    }
       

}
