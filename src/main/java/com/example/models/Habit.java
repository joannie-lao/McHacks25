package com.example.models;

import java.time.LocalDate;

public class Habit {
    String name;
    int frequency;
    TimeUnit unit;
    int streak;
    private LocalDate lastCompleted;

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
    }
}