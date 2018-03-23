package com.example;

import com.example.models.Graph;
import com.example.models.Link;
import com.example.models.Node;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@SpringBootApplication
public class Main {

    Graph graph = new Graph();

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/other")
    String other() {
        return "other";
    }

    @RequestMapping("/api/graph")
    @ResponseBody
    public Graph getGraph() {
        return graph;
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
    public Graph deleteGraph() {
        graph = new Graph();
        return graph;
    }
}
