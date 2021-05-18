import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/Student";
import {StudentService} from "../../service/student.service";

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {

  public listStudent: Student[] = [];
  constructor(private _studentService: StudentService) { }

  ngOnInit(): void {
    this._studentService.getListStudent().subscribe(data => {
      this.listStudent = data;
    }, error => {
      console.log("Get "+error+" on getListProduct()");
    });
  }

}
