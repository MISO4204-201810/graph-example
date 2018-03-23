package com.example.models;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Node> nodes = new ArrayList<Node>();
    private ArrayList<Link> links = new ArrayList<Link>();

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Link> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<Link> links) {
        this.links = links;
    }
}
