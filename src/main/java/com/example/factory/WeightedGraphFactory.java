package com.example.factory;
import com.example.factory.interfaces.IGraphFactory;
import com.example.models.WeightedGraph;
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
        return null;
    }

    @Override
    public ILink createLink() {
        return null;
    }
}
