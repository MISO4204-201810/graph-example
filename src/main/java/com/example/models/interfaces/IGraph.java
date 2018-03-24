package com.example.models.interfaces;

import java.util.ArrayList;

public interface IGraph {

    ArrayList<INode> getNodes();

    void setNodes(ArrayList<INode> nodes);

    ArrayList<ILink> getLinks();

    void setLinks(ArrayList<ILink> links);
}
