package com.example.factory;

import com.example.factory.interfaces.IGraphFactory;
import com.example.models.Node;
import com.example.models.WeightedGraph;
import com.example.models.WeightedLink;
import com.example.models.interfaces.IGraph;
import com.example.models.interfaces.ILink;
import com.example.models.interfaces.INode;

public class WeightedGraphFactory implements IGraphFactory {
    @Override
    public IGraph createGraph() {
        IGraph graph = new WeightedGraph();
        return graph;
    }

    @Override
    public INode createNode() {
        INode node = new Node(2);
        return node;
    }

    @Override
    public ILink createLink() {
        ILink link = new WeightedLink(1, 2, 10);
        return link;
    }
}
