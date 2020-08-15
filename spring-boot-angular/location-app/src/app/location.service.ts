import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

const API = `${environment.baseApi}/locations`

@Injectable({
  providedIn: 'root'
})
export class LocationService {

  constructor(private http: HttpClient) { }

  getDivisions() {
    return this.http.get<any[]>(API)
  }

  findById(id: string) {
    return this.http.get<any>(`${API}/${id}`)
  }
}
