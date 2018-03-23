import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {Node, Link} from '../d3';

@Injectable()
export class RestApiGraphService {

    constructor(private httpClient: HttpClient) {
    }

    public loadGraph(): Observable<any> {
        const url = `/api/graph`;
        return this.httpClient.get<any>(url);
    }

    public addNode(node: Node): Observable<any> {
        const url = `/api/graph/node`;
        return this.httpClient.put<any>(url, node);
    }

    public addLink(link: Link): Observable<any> {
        const url = `/api/graph/link`;
        return this.httpClient.put<any>(url, link);
    }

    public reset(): Observable<any> {
        const url = `/api/graph`;
        return this.httpClient.delete<any>(url);
    }
}
