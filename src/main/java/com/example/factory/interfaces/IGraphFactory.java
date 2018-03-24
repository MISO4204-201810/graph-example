package com.example.factory.interfaces;

import com.example.models.interfaces.IGraph;
import com.example.models.interfaces.ILink;
import com.example.models.interfaces.INode;

public interface IGraphFactory {

    IGraph createGraph();

    INode createNode();

    ILink createLink();
}
