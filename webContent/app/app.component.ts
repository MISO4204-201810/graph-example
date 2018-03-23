import {Component, OnInit} from '@angular/core';
import APP_CONFIG from './app.config';
import {Node, Link} from './d3';
import {RestApiGraphService} from "./rest-api/rest-api-graph.service";
import {Graph} from "./d3/models/graph";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss']
})

export class AppComponent implements OnInit {
    nodes: Node[] = [];
    links: Link[] = [];
    graph: Graph;
    loading = true;

    constructor(private _restApiGraph: RestApiGraphService) {
    }

    public ngOnInit() {
        this.loadGraph();
    }

    loadGraph() {
        this.nodes = [];
        this.links = [];
        this._restApiGraph.loadGraph()
            .subscribe(
                (graph: Graph) => {
                    console.log(graph);
                    this.loading = false;
                    graph.nodes.forEach((nde: Node) => {
                        let node = new Node(nde.id);
                        node.linkCount = nde.linkCount;
                        this.nodes.push(node);
                    });
                    graph.links.forEach((link: Link) => {
                        this.links.push(link);
                    });
                }
            );
    }

    addNode() {
        this._restApiGraph.addNode(null)
            .subscribe((nde: Node) => {
                    let node = new Node(nde.id);
                    node.linkCount = nde.linkCount;
                    this.nodes.push(node);
                }
            );
    }

    addLink() {
        this._restApiGraph.addLink(null)
            .subscribe((lnk: Link) => {
                    let link = new Link(lnk.source, lnk.target);
                    this.links.push(link);
                }
            );
    }

    reset(){
        this._restApiGraph.reset()
            .subscribe((graph: Graph) => {
                this.nodes = [];
                this.links = [];
                }
            );
    }
}
