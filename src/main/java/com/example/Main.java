package com.example;

import com.example.models.Graph;
import com.example.models.Link;
import com.example.models.Node;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@SpringBootApplication
public class Main {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }


    @RequestMapping("/api/graph")
    @ResponseBody
    public Graph getGraph() {
        Graph graph = new Graph();
        Node cinco = new Node(5);
        cinco.setLinkCount(5);
        graph.getNodes().add(new Node(1));
        graph.getNodes().add(new Node(2));
        graph.getNodes().add(new Node(3));
        graph.getNodes().add(new Node(4));
        graph.getNodes().add(cinco);

        graph.getLinks().add(new Link(1, 5));
        graph.getLinks().add(new Link(1, 4));
        graph.getLinks().add(new Link(1, 2));
        graph.getLinks().add(new Link(3, 5));
        return graph;
    }

}
