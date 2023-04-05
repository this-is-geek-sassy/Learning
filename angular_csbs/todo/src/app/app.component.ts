import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  // @Input()  value!: number | string;

  title = 'Todo list on Anguar';
  textboxValue = '';

  taskList: any[] = [];

  data = 10;

  userDetails = [
    {
      name: 'Anil Kumar Majumdaar', 
      email: 'anil@test.com'
    },
    {
      name: 'Bhaskar', 
      email: 'bhaskar@test.com'
    },
    {
      name: 'Sam', 
      email: 'sam@test.com'
    },
    {
      name: 'Peter', 
      email: 'peter@test.com'
    }
  ];

  __data = 'x';

  addTask(item: string) {
    // console.log(item);
    this.taskList.push({id: this.taskList.length, name: item});
    console.log(this.taskList);
    this.textboxValue = '';
    // this.value = this.textboxValue;
  }

  removeTask(id: number) {
    this.taskList = this.taskList.filter(item => item.id !== id);
  }

  updateChild() {
    this.data = Math.floor(Math.random()*1000);
  }

  updateData(item: string) {
    console.log(item);
    this.__data = item;
  }
}
