import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
// import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserPrefComponent } from './user-pref/user-pref.component';
import { StudentPrefComponent } from './student-pref/student-pref.component';
import { CountryListComponent } from './country-list/country-list.component';

import { UserAuth2Module } from "./user-auth2/user-auth2.module";
import { HeaderComponent } from './header/header.component';
import { FormsModule } from "@angular/forms";
import { Form1Component } from './form1/form1.component';
// import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    // LoginComponent,
    RegisterComponent,
    UserListComponent,
    UserPrefComponent,
    StudentPrefComponent,
    CountryListComponent,
    HeaderComponent,
    Form1Component
  ],
  imports: [
    BrowserModule,
    UserAuth2Module,
    FormsModule,
    // NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
