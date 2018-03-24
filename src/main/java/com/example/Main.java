package com.example;

import com.example.enums.FindType;
import com.example.enums.GraphType;
import com.example.factory.DirectedGraphFactory;
import com.example.factory.UndirectedGraphFactory;
import com.example.factory.UnweightedGraphFactory;
import com.example.factory.WeightedGraphFactory;
import com.example.factory.interfaces.IGraphFactory;
import com.example.models.interfaces.IGraph;
import com.example.models.Link;
import com.example.models.Node;
import com.example.models.interfaces.ILink;
import com.example.models.interfaces.INode;
import com.example.strategy.BSFFindStrategy;
import com.example.strategy.DFSFindStrategy;
import com.example.strategy.interfaces.IFindStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class Main {

    IGraph graph;
    IGraphFactory _graphFactory;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping(value = "/api/graph/{graphType}", method = RequestMethod.GET)
    @ResponseBody
    public IGraph getGraph(@PathVariable("graphType") GraphType graphType) {
        this._graphFactory = this.getGraphFactory(graphType);
        this.graph = _graphFactory.createGraph();
        return this.graph;
    }

    @RequestMapping(value = "/api/graph/node", method = RequestMethod.PUT)
    @ResponseBody
    public INode addNode() {
        INode node = this._graphFactory.createNode();
        this.graph.addNode(node);
        return node;
    }


    @RequestMapping(value = "/api/graph/link", method = RequestMethod.PUT)
    @ResponseBody
    public ILink addLink() {
        ILink link = this._graphFactory.createLink();
        this.graph.addLink(link);
        return link;
    }

    @RequestMapping(value = "/api/graph", method = RequestMethod.DELETE)
    @ResponseBody
    public IGraph deleteGraph() {
        this.graph = _graphFactory.createGraph();
        return this.graph;
    }

    @RequestMapping(value = "/api/graph/node/{nodeId}", method = RequestMethod.GET)
    @ResponseBody
    public INode findNode(@PathVariable("nodeId") String nodeId, @RequestParam FindType findType) {
        IFindStrategy findStrategy = this.getFindStrategy(findType);
        return findStrategy.findNode(nodeId);
    }


    private IGraphFactory getGraphFactory(GraphType graphType) {
        switch (graphType) {
            case directed:
                return new DirectedGraphFactory();
            case undirected:
                return new UndirectedGraphFactory();
            case weighted:
                return new WeightedGraphFactory();
            case unweighted:
                return new UnweightedGraphFactory();
        }
        return new DirectedGraphFactory();
    }


    private IFindStrategy getFindStrategy(FindType findType) {
        switch (findType) {
            case BSFFind:
                return new BSFFindStrategy();
            case DFSFind:
                return new DFSFindStrategy();
        }
        return new BSFFindStrategy();
    }
}
