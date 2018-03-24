package com.example.strategy;

import com.example.models.Node;
import com.example.models.interfaces.INode;
import com.example.strategy.interfaces.IFindStrategy;

public class DFSFindStrategy implements IFindStrategy {
    @Override
    public INode findNode(String id) {
        return new Node(1, "Found with DFSFindStrategy");
    }
}
