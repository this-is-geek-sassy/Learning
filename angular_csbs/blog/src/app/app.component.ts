import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'blog';   // variable declaration syntax
  number = 12;

  data = 'code step by step';  // properties

  getValue() {   // function

    return "getting function data";
  }

  getName(name: string, age: number) {   // function syntax (different from vanilla JS)

    alert("function called " + name + " " + age);
  }
}
