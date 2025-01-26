package com.example.models;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class Habit {
    private String name;
    private int frequency;
    private TimeUnit unit;
    private int streak;
    private LocalDate lastCompleted;
    private Integer difficulty;

    Habit(String name, int frequency, TimeUnit unit, int difficulty){
        this.name = name;
        this.frequency = frequency;
        this.unit = unit;
        this.streak = 0;
        this.lastCompleted = null;
    }

    public void habitCompleted(){
        LocalDate today = LocalDate.now();
        if (lastCompleted != null){
            // If the last time a habit was completed was yesterday, update the streak appropriately.
            if (lastCompleted.plusDays(1) == today){
                streak++;
            }
        }
        // If the task has never been completed or the last time it was completed was not yesterday, update the streak appropriately. 
        else if (lastCompleted == null || lastCompleted.plusDays(1) != today){
            streak = 1;
        }
        lastCompleted = today;
        }
        public void resetStreak(){
            streak = 0;
        }
        public int getStreak(){
            return streak;
        }
        public Integer getDifficulty(){
            return difficulty;
        }
        public int calculateCoins(int multiplier){
            double worthiness = 0;
            //worthiness is calculated both by the length of the streak and the required frequency over time of the habit
            double normalizedFrequency = (double) frequency / TimeUnit.DAYS.convert(frequency,unit);

            return (int) Math.round(worthiness * multiplier);
        }
    }