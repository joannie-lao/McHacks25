package com.example.models;

import java.util.List;

public class GrowableBehavior{

    private int growthStage;
    private List<String> growthStages;
    private boolean frozen;
    private int numStates;

    public GrowableBehavior(List<String> growthStages) {
        this.growthStages = growthStages;
        this.numStates = growthStages.size();
        this.growthStage = 0;
        this.frozen = false;
    }

    public void grow() {
        if (!frozen && growthStage < numStates - 1) {
            growthStage++;
        }
    }

    public void freeze() {
        frozen = true;
    }

    public void unfreeze() {
        frozen = false;
    }

    public String getGrowthStageImage(){
        return growthStages.get(growthStage);
    }
    


}
