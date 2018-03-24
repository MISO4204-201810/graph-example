package com.example.factory;

import com.example.factory.interfaces.IGraphFactory;
import com.example.models.DirectedGraph;
import com.example.models.DirectedLink;
import com.example.models.Node;
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
        INode node = new Node(4);
        return node;
    }

    @Override
    public ILink createLink() {
        ILink link = new DirectedLink(1, 2);
        return link;
    }
}
