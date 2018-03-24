package com.example.models;

import com.example.models.interfaces.ILink;

public class DirectedLink extends Link implements ILink {

    private Boolean directed;

    public DirectedLink(int source, int target) {
        super(source, target);
        this.directed = true;
    }

    public Boolean getDirected() {
        return directed;
    }

    public void setDirected(Boolean directed) {
        this.directed = directed;
    }
}
