package com.example.models;

import com.example.enums.GraphType;
import com.example.models.interfaces.IGraph;
import com.example.models.interfaces.ILink;
import com.example.models.interfaces.INode;

import java.util.ArrayList;

public class UndirectedGraph implements IGraph {
    private GraphType type = GraphType.undirected;
    private ArrayList<INode> nodes = new ArrayList<INode>();
    private ArrayList<ILink> links = new ArrayList<ILink>();

    public UndirectedGraph() {
        nodes.add(new Node(1));
        nodes.add(new Node(2));
        nodes.add(new Node(3));
        nodes.add(new Node(4));

        links.add(new Link(1, 3));
        links.add(new Link(1, 4));
        links.add(new Link(1, 2));
        links.add(new Link(3, 4));
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

    public GraphType getType() {
        return type;
    }
    @Override
    public void addNode(INode node) {
        this.nodes.add(node);
    }

    @Override
    public void addLink(ILink link) {
        this.links.add(link);
    }
}
