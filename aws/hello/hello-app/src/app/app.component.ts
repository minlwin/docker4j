import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styles: []
})
export class AppComponent {

  form: FormGroup
  list = []

  constructor(builder: FormBuilder, private service: AppService) {
    this.form = builder.group({
      user: ["", Validators.required],
      message: ["", Validators.required]
    })

    service.getHellos().subscribe(data => this.list = data)
  }

  sendMessage() {
    this.service.createHello(this.form.value).subscribe(() => {
      this.form.patchValue({
        user: "",
        message: ""
      })
      this.service.getHellos().subscribe(data => this.list = data)
    })
  }
}
