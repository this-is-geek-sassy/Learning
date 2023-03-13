import { Component } from '@angular/core';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent {

  show: string = 'yes';
  bgColor: string = '#0E8388';
  color: string = 'red';

  updateColor() {
    this.color = 'blue';
    this.bgColor = '#CBE4DE';
  }
}
