package com.example.factory;

import com.example.factory.interfaces.IGraphFactory;
import com.example.models.DirectedGraph;
import com.example.models.interfaces.IGraph;
import com.example.models.interfaces.ILink;
import com.example.models.interfaces.INode;

public class DirectedGraphFactory implements IGraphFactory {
    @Override
    public IGraph createGraph() {
        IGraph graph = new DirectedGraph();
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
