package com.example.models;

import com.example.enums.GraphType;
import com.example.models.interfaces.IGraph;
import com.example.models.interfaces.ILink;
import com.example.models.interfaces.INode;

import java.util.ArrayList;

public class UnweightedGraph implements IGraph {

    private GraphType type = GraphType.unweighted;
    private ArrayList<INode> nodes = new ArrayList<INode>();
    private ArrayList<ILink> links = new ArrayList<ILink>();

    public UnweightedGraph() {
        nodes.add(new Node(1));
        nodes.add(new Node(2));
        nodes.add(new Node(3));

        links.add(new Link(1, 2));
        links.add(new Link(1, 3));
        links.add(new Link(2, 3));
    }

    @Override
    public void addNode(INode node) {
        this.nodes.add(node);
    }

    @Override
    public void addLink(ILink link) {
        this.links.add(link);
    }

    public GraphType getType() {
        return type;
    }

    public void setType(GraphType type) {
        this.type = type;
    }

    public ArrayList<INode> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<INode> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<ILink> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<ILink> links) {
        this.links = links;
    }
}
