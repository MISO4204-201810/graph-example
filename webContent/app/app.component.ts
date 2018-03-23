import {Component, OnInit} from '@angular/core';
import APP_CONFIG from './app.config';
import {Node, Link} from './d3';
import {RestApiGraphService} from "./rest-api/rest-api-graph.service";
import {Graph} from "./d3/models/graph";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
    nodes: Node[] = [];
    links: Link[] = [];
    graph: Graph;
    loading = true;

    constructor(private _restApiGraph: RestApiGraphService) {
        console.log("nodes ", JSON.stringify(this.nodes));
        console.log("links ", JSON.stringify(this.links));
    }

    public ngOnInit() {
        this._restApiGraph.loadGraph().subscribe(
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
}
