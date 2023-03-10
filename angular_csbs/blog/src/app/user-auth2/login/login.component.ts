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
}
