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
    private int dayFreq;

    Habit(String name, int frequency, TimeUnit unit, int difficulty){
        this.name = name;
        this.frequency = frequency;
        this.unit = unit;
        this.streak = 0;
        this.lastCompleted = null;
        dayFreq = (int) TimeUnit.DAYS.convert(frequency,unit);
    }

    public void habitCompleted(){
        LocalDate today = LocalDate.now();
        if (lastCompleted != null){
            // If the last time a habit was completed was yesterday, update the streak appropriately.
            if (lastCompleted.plusDays(dayFreq) == today||today.isAfter(lastCompleted.plusDays(dayFreq))){
                streak++;
            }
        }
        // If the task has never been completed or the last time it was completed was not within the given time frame, update the streak appropriately. 
        else if (lastCompleted == null || lastCompleted.plusDays(dayFreq).isBefore(today)){
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
            //worthiness is calculated by the length of the streak (increase) and the frequency of the habit (higher frequency worth less)
            double normalizedFrequency = (double) frequency / dayFreq;
            worthiness = streak * normalizedFrequency; //make sure this calculates in the right direction
            return (int) Math.round(worthiness * multiplier);
        }
    }