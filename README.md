# Graph example whit design patterns

###Demo: https://graph-example.herokuapp.com/
### Method to choose the implementation of the factory
* Directed: https://graph-example.herokuapp.com/api/graph/directed
* Undirected: https://graph-example.herokuapp.com/api/graph/undirected
* Weighted: https://graph-example.herokuapp.com/api/graph/weighted
* Unweighted: https://graph-example.herokuapp.com/api/graph/unweighted

```java
    @RequestMapping(value = "/api/graph/{graphType}", method = RequestMethod.GET)
    @ResponseBody
    public IGraph getGraph(@PathVariable("graphType") GraphType graphType) {
        this._graphFactory = this.getGraphFactory(graphType);
        this.graph = _graphFactory.createGraph();
        return this.graph;
    }
```


### Method to choose the search strategy
* DFSFind: https://graph-example.herokuapp.com/api/graph/node/1?findType=DFSFind
* BSFFind: https://graph-example.herokuapp.com/api/graph/node/1?findType=BSFFind

```java
    @RequestMapping(value = "/api/graph/node/{nodeId}", method = RequestMethod.GET)
    @ResponseBody
    public INode findNode(@PathVariable("nodeId") String nodeId, @RequestParam FindType findType) {
        IFindStrategy findStrategy = this.getFindStrategy(findType);
        return findStrategy.findNode(nodeId);
    }
```
