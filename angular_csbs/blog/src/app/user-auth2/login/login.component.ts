import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  // name: string = 'peter';
  // disablePasswd: boolean = false;

  users: Array<string> = ['anil', 'bhaskar', 'sam', 'peter', 'bruce'];

  userDetails: Array<object> = [
    {
      name: this.users[0],
      email: this.users[0] + "@gmail.com",
      phoneNumber: "6454"
    },
    {
      name: this.users[1],
      email: this.users[1] + "@gmail.com",
      phoneNumber: "6453"
    },
    {
      name: this.users[2],
      email: this.users[2] + "@gmail.com",
      phoneNumber: "6452"
    },
    {
      name: this.users[3],
      email: this.users[3] + "@gmail.com",
      phoneNumber: "6450"
    },
    {
      name: this.users[4],
      email: this.users[4] + "@gmail.com",
      phoneNumber: "6459"
    }
  ];

  getAttributeName(arrayitem: any, property: string = 'name') {

    return arrayitem.name;

    // this way of doing might not be the best and cleanest code to write.
    // take suggestion on this issue on how to write some getters and setters (if possible)
  }

  justAnObject: object = {
    name: "saswata mishra",
    dob: "03-07-1999",
    favColor: 'blue',

    
    // get getName() : string {
    //   return `${this.}`;
    // }
    
  };

}
