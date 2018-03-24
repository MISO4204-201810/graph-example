package com.example.models;

import com.example.models.interfaces.ILink;

public class WeightedLink extends Link implements ILink {

    private int weight;

    public WeightedLink(int source, int target, int weight) {
        super(source, target);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
