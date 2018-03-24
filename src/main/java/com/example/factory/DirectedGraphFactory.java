package com.example.factory;

import com.example.factory.interfaces.IGraphFactory;
import com.example.models.DirectedGraph;
import com.example.models.interfaces.IGraph;

public class DirectedGraphFactory implements IGraphFactory {
    @Override
    public IGraph createGraph() {
        IGraph graph = new DirectedGraph();
        return graph;
    }
}
