package com.example.models;

import com.example.models.interfaces.ILink;

public class Link implements ILink{

    private int source;
    private int target;

    public Link(int source, int target) {
        this.source = source;
        this.target = target;
    }


    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
}
