import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Todo list on Anguar';

  taskList: any[] = [];

  data = 10;

  addTask(item: string) {
    // console.log(item);
    this.taskList.push({id: this.taskList.length, name: item});
    console.log(this.taskList);
  }

  removeTask(id: number) {
    this.taskList = this.taskList.filter(item => item.id !== id);
  }

  updateChild() {
    this.data = Math.floor(Math.random()*1000);
  }
}
