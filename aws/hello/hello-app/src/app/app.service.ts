import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../environments/environment';

const API = `${environment.baseApi}/hellos`

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http: HttpClient) { }

  createHello(hello: any) {
    return this.http.post<any>(API, hello)
  }

  getHellos() {
    return this.http.get<any[]>(API)
  }
}
