# Graph example whit design patterns

### Demo: https://graph-example.herokuapp.com/
### Method to choose (set) the implementation of the factory
* Directed: PUT https://graph-example.herokuapp.com/api/graph/directed
* Undirected: PUT https://graph-example.herokuapp.com/api/graph/undirected
* Weighted: PUT https://graph-example.herokuapp.com/api/graph/weighted
* Unweighted: PUT https://graph-example.herokuapp.com/api/graph/unweighted

```java
    @RequestMapping(value = "/api/graph/{graphType}", method = RequestMethod.PUT)
    @ResponseBody
    public IGraph setTypeGraph(@PathVariable("graphType") GraphType graphType) {
        this._graphFactory = this.getGraphFactory(graphType);
        this.graph = _graphFactory.createGraph();
        return this.graph;
    }
```


### Method to get the graph data
* Graph: GET https://graph-example.herokuapp.com/api/graph
```java
    @RequestMapping(value = "/api/graph", method = RequestMethod.GET)
    @ResponseBody
    public IGraph getGraph() {
        return this.graph;
    }
```

### Method to choose the search strategy
* DFSFind: GET https://graph-example.herokuapp.com/api/graph/node/1?findType=DFSFind
* BSFFind: GET https://graph-example.herokuapp.com/api/graph/node/1?findType=BSFFind

```java
    @RequestMapping(value = "/api/graph/node/{nodeId}", method = RequestMethod.GET)
    @ResponseBody
    public INode findNode(@PathVariable("nodeId") String nodeId, @RequestParam FindType findType) {
        IFindStrategy findStrategy = this.getFindStrategy(findType);
        return findStrategy.findNode(nodeId);
    }
```


### Method to add Node to the graph data
* Graph: GET https://graph-example.herokuapp.com/api/graph
```java
    @RequestMapping(value = "/api/graph/node", method = RequestMethod.PUT)
    @ResponseBody
    public INode addNode() {
        INode node = this._graphFactory.createNode();
        this.graph.addNode(node);
        return node;
    }
```


### Method to add Link to the graph data
* Graph: GET https://graph-example.herokuapp.com/api/graph
```java
    @RequestMapping(value = "/api/graph/link", method = RequestMethod.PUT)
    @ResponseBody
    public ILink addLink() {
        ILink link = this._graphFactory.createLink();
        this.graph.addLink(link);
        return link;
    }
```