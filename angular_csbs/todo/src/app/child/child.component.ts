import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  constructor() { }

  @Input() item = 0;  // item is catching the value passed by it's parent component 'app' through app's item property, and 0 is its default value

  //ngOnInit(): void {

  // }
}
