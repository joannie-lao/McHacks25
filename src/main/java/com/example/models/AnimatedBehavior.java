package com.example.models;

import java.util.List;

public class AnimatedBehavior{;
    private List<String> frames;
    private int numStates;
    private int currentFrame;

    public AnimatedBehavior(List<String> frames) {
        this.frames = frames;
        this.numStates = frames.size();
        this.currentFrame = 0;
    }

    public void animate() {
        currentFrame = (currentFrame + 1) % numStates;
    }

    public String getCurrentFrame(){
        return frames.get(currentFrame);
    }


}
