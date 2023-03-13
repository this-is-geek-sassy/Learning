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

  getData(value: any) {

    console.warn("function called!" + " " + value);
    // console.log(event.target.value);   // i don't know why it is depricated
  }

  // getTextValue(val: any) {     // bekaar try, jut ignore
  //   let valueWeGot = val;

  //   console.log(valueWeGot);

  //   document.getElementById("displayArea")?.innerText = valueWeGot;
  // }

  valueWeGot = '';

  getTextValue(val: any) {

    this.valueWeGot = val;

  }

  count: number = 0;
  counter(type: string) {

    type === 'add' ? this.count++ : this.count--;

    console.log(this.count);
  }

  color = 'red';

  display: boolean = true;
  toggle() {
    // this.display = this.display ? false : true;

    this.display = !this.display;
  }
}
