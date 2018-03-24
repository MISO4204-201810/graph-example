package com.example;

import com.example.enums.GraphType;
import com.example.factory.DirectedGraphFactory;
import com.example.factory.UndirectedGraphFactory;
import com.example.factory.interfaces.IGraphFactory;
import com.example.models.interfaces.IGraph;
import com.example.models.Link;
import com.example.models.Node;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Node addNode() {
        int number = graph.getNodes().size() + 1;
        Node node = new Node(number);
        graph.getNodes().add(node);
        return node;
    }


    @RequestMapping(value = "/api/graph/link", method = RequestMethod.PUT)
    @ResponseBody
    public Link addLink() {
        int number = graph.getNodes().size() + 1;
        Link link = new Link(1, 9);
        graph.getLinks().add(link);
        return link;
    }

    @RequestMapping(value = "/api/graph", method = RequestMethod.DELETE)
    @ResponseBody
    public IGraph deleteGraph() {
        this.graph = _graphFactory.createGraph();
        return this.graph;
    }


    private IGraphFactory getGraphFactory(GraphType graphType) {
        switch (graphType) {
            case directed:
                return new DirectedGraphFactory();
            case undirected:
                return new UndirectedGraphFactory();
        }
        return new DirectedGraphFactory();
    }
}
