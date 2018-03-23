package com.example.models;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Node> nodes = new ArrayList<Node>();
    private ArrayList<Link> links = new ArrayList<Link>();

    public Graph() {
        Node cinco = new Node(5);
        cinco.setLinkCount(5);
        nodes.add(new Node(1));
        nodes.add(new Node(2));
        nodes.add(new Node(3));
        nodes.add(new Node(4));
        nodes.add(cinco);

        links.add(new Link(1, 5));
        links.add(new Link(1, 4));
        links.add(new Link(1, 2));
        links.add(new Link(3, 5));
    }

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
