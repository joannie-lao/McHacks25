package com.example.models;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList; 
import java.util.Queue; 

public class Habit {
    private String name;
    private int frequency;
    private TimeUnit unit;
    private int streak;
    private LocalDate lastCompleted;
    private Integer difficulty;
    private int dayFreq;
    private SizeLimitedQueue<LocalDate> total;

    public static class SizeLimitedQueue<LocalDate> extends LinkedList<LocalDate> {
        private int limit;

        public SizeLimitedQueue(int limit) {
            this.limit = limit;
        }
        @Override
        public boolean add(LocalDate mostRecent){
            while (this.size() == limit){
                super.remove();
            }
            super.add(mostRecent);
            return true;
        }
    }

    Habit(String name, int frequency, TimeUnit unit, int difficulty){
        this.name = name;
        this.frequency = frequency;
        this.unit = unit;
        this.streak = 0;
        this.lastCompleted = null;
        dayFreq = (int) TimeUnit.DAYS.convert(frequency,unit);
        this.total = new SizeLimitedQueue<LocalDate>(frequency);
    }

    public void habitCompleted(){
        LocalDate today = LocalDate.now();
        LocalDate toCheck = LocalDate.now();
        for (int i = 0; i < dayFreq; i++){
            toCheck = toCheck.minusDays(1);
        }
        if (lastCompleted != null){
            // If the last time a habit was completed was yesterday, update the streak appropriately.
            if (total.peek().isAfter(toCheck)){
                streak++;
            }
        }
        // If the task has never been completed or the last time it was completed was not within the given time frame, update the streak appropriately. 
        else if (lastCompleted == null || !total.peek().isAfter(toCheck)){
            streak = 1;
        }
        lastCompleted = today;
        total.add(today);

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
