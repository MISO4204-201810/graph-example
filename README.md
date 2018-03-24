# Graph example whit design patterns

### Method to choose the implementation of the factory
```java
    @RequestMapping(value = "/api/graph/{graphType}", method = RequestMethod.GET)
    @ResponseBody
    public IGraph getGraph(@PathVariable("graphType") GraphType graphType) {
        this._graphFactory = this.getGraphFactory(graphType);
        this.graph = _graphFactory.createGraph();
        return this.graph;
    }
```