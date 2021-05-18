import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListStudentComponent} from "./student/list-student/list-student.component";
import {EditStudentComponent} from "./student/edit-student/edit-student.component";
import {DeleteStudentComponent} from "./student/delete-student/delete-student.component";
import {AddStudentComponent} from "./student/add-student/add-student.component";


const routes: Routes = [
  {path: "list", component: ListStudentComponent},
  {path: "list/add", component: AddStudentComponent},
  {path: "list/edit/:id", component: EditStudentComponent},
  {path: "list/delete/:id", component: DeleteStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
