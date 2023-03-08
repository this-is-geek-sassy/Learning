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

@NgModule({
  declarations: [
    AppComponent,
    // LoginComponent,
    RegisterComponent,
    UserListComponent,
    UserPrefComponent,
    StudentPrefComponent,
    CountryListComponent
  ],
  imports: [
    BrowserModule,
    UserAuth2Module
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
