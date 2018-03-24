package com.example.models;

import com.example.models.interfaces.INode;

public class Node implements INode {

    private int id;
    private int linkCount;

    public Node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLinkCount() {
        return linkCount;
    }

    public void setLinkCount(int linkCount) {
        this.linkCount = linkCount;
    }
}
