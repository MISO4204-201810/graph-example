package com.example.factory;

import com.example.factory.interfaces.IGraphFactory;
import com.example.models.UndirectedGraph;
import com.example.models.interfaces.IGraph;
import com.example.models.interfaces.ILink;
import com.example.models.interfaces.INode;

public class UndirectedGraphFactory implements IGraphFactory {
    @Override
    public IGraph createGraph() {
        IGraph graph = new UndirectedGraph();
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
