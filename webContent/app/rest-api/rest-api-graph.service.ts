import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class RestApiGraphService {

    constructor(private httpClient: HttpClient) {
    }

    public loadGraph(): Observable<any> {
        const url = `/api/graph`;
        return this.httpClient.get<any>(url);
    }
}
