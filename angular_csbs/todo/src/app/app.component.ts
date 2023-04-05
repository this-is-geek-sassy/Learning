import { JsonPipe } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  // @Input()  value!: number | string;

  ngOnInit(): void {
    //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
    //Add 'implements OnInit' to the class.
    console.log(this.userJSON);
    console.log(JSON.stringify(this.user));
    console.log(typeof JSON.stringify(this.user));
  }

  title = 'Todo list on Angular';
  textboxValue = '';

  today = new Date();

  user = {
    name: 'Anil',
    age: 28
  }

  userJSON = new JsonPipe();

  taskList: any[] = [];

  data = 10;

  name: any;

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

  getVal(item:any) {
    console.log(item);
  }
}
