import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-user-detail',
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.css']
})
export class UserDetailComponent {

  constructor() {
    // super();
    
  }

  @Input() item: {name: string, email: string} = {name:"", email:""};

}
