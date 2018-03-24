package com.example.factory;

import com.example.factory.interfaces.IGraphFactory;
import com.example.models.UndirectedGraph;
import com.example.models.interfaces.IGraph;

public class UndirectedGraphFactory implements IGraphFactory {
    @Override
    public IGraph createGraph() {
        IGraph graph = new UndirectedGraph();
        return graph;
    }
}
