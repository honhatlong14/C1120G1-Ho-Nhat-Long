import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/Student";
import {ActivatedRoute, Router} from "@angular/router";
import {StudentService} from "../../service/student.service";

@Component({
  selector: 'app-delete-student',
  templateUrl: './delete-student.component.html',
  styleUrls: ['./delete-student.component.css']
})
export class DeleteStudentComponent implements OnInit {

  public student:Student;
  public id:number;

  constructor(
    private studentService:StudentService,
    private activatedRoute:ActivatedRoute,
    private router:Router
  ) { }

  ngOnInit(): void {
    let id:number = this.activatedRoute.snapshot.params['id'];
    this.id = id;
    this.studentService.getProductById(id).subscribe( data => {
      this.student = data;
    })
  }

  deleteProduct() {
    console.log("ID PRODUCT DELETE : "+this.id)
    this.studentService.deleteStudentById(this.id).subscribe(data => {
      this.backToList();
    });
  }

  backToList() {
    this.router.navigateByUrl("list");
  }

}
