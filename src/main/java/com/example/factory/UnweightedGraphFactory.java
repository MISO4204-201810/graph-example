package com.example.factory;

import com.example.factory.interfaces.IGraphFactory;
import com.example.models.UnweightedGraph;
import com.example.models.interfaces.IGraph;
import com.example.models.interfaces.ILink;
import com.example.models.interfaces.INode;

public class UnweightedGraphFactory implements IGraphFactory {
    @Override
    public IGraph createGraph() {
        IGraph graph = new UnweightedGraph();
        return graph;
    }

    @Override
    public INode createNode() {
        return null;
    }

    @Override
    public ILink createLink() {
        return null;
    }
}
