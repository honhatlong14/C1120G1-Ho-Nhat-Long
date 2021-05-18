import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListStudentComponent } from './student/list-student/list-student.component';
import { EditStudentComponent } from './student/edit-student/edit-student.component';
import { DeleteStudentComponent } from './student/delete-student/delete-student.component';
import {HttpClientModule} from "@angular/common/http";
import { StudentComponent } from './student/student.component';
import {ReactiveFormsModule} from "@angular/forms";
import { AddStudentComponent } from './student/add-student/add-student.component';

@NgModule({
  declarations: [
    AppComponent,
    ListStudentComponent,
    EditStudentComponent,
    DeleteStudentComponent,
    StudentComponent,
    AddStudentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
