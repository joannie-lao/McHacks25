package com.example.models;

import java.util.List;

public class RotatableBehavior {
    private List<String> angles;
    private int currentAngle;
    
    public RotatableBehavior(List<String> angles){
        this.angles = angles;
    }
    
    public List<String> getAngles(){
        return angles;
    }
    
    public void setAngles(List<String> angles){
        this.angles = angles;
    }
    
    public void rotate(String direction){
        //rotate the decoration in the specified direction
        currentAngle = (currentAngle + 1) % angles.size();
    }
    public void rotateRandomly(){
        //rotate the decoration to a random angle
    }
    public void rotateToAngle(int angle){
        //rotate the decoration to the specified angle
    }
}
