import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ChildComponent } from './child/child.component';
import { UserDetailComponent } from './user-detail/user-detail.component';
import { Child2Component } from './child2/child2.component';

import { FormsModule } from "@angular/forms";
import { UsdToInrPipe } from './custom-pipes/usd-to-inr.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    UserDetailComponent,
    Child2Component,
    UsdToInrPipe
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
