package com.example.models;

import com.example.models.interfaces.INode;

public class Node implements INode {

    private int id;
    private int linkCount;
    private String description;

    public Node(int id) {
        this.id = id;
    }

    public Node(int id, String description) {
        this.id = id;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
