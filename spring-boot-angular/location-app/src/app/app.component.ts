import { Component } from '@angular/core';
import { LocationService } from './location.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styles: []
})
export class AppComponent {
  title = 'location-app';

  divisions = []
  townships = []
  division: any

  constructor(private service: LocationService) {
    service.getDivisions().subscribe(data => {
      this.divisions = data
      if (data.length) {
        this.loadTownship(data[0].id)
      }
    })
  }

  loadTownship(id: string) {
    this.service.findById(id).subscribe(data => {
      this.division = data.division
      this.townships = data.townships
    })
  }
}
