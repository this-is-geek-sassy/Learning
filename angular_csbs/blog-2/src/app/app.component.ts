import { Component } from '@angular/core';

import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'template driven form: ';
  title2 = 'reactive form: ';

  loginForm = new FormGroup({
    user: new FormControl(this.title2),   // default values set
    password: new FormControl('saswata')
  });

  userLogin(item:any): void {
    console.log(item);
  }

  login(): void {
    console.log(this.loginForm.value);
  }

  // in the html file it is not recomended to mix template driven form and reactive forms: https://stackoverflow.com/questions/55739509/mixing-reactive-form-with-template-form 
}
