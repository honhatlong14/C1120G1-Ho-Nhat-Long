import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Student} from "../../model/Student";
import {ActivatedRoute, Router} from "@angular/router";
import {StudentService} from "../../service/student.service";

@Component({
  selector: 'app-edit-student',
  templateUrl: './edit-student.component.html',
  styleUrls: ['./edit-student.component.css']
})
export class EditStudentComponent implements OnInit {
  editStudent:Student;
  editForm: FormGroup;
  id:number;

  constructor(private _formBuilder: FormBuilder,
              private studentService:StudentService,
              private activatedRoute:ActivatedRoute,
              private router:Router)
  { }

  ngOnInit(): void {
    let id:number = this.activatedRoute.snapshot.params['id'];
    this.id = id;

    this.studentService.getProductById(id).subscribe(data => {
      let student:Student = data;
      this.editForm = this._formBuilder.group({
        name_student: [student.name_student, [Validators.required, Validators.pattern(/^[0-9a-zA-Z]*$/)]],
        name_group: [student.name_group, [Validators.required]],
        name_topic: [student.name_topic, [Validators.required, Validators.min(10000), Validators.max(50000000)]],
        tutor: [student.tutor, [Validators.required]],
        email: [student.email, [Validators.required,Validators.pattern("[a-zA-Z0-9_\\.\\+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-\\.]+")]],
        phone: [student.phone, [Validators.required,Validators.pattern("\\d{10,12}")]]
      });
      return this.editStudent = data;
    },error => {
      console.log("get "+error+" on edit-student.component.ts")
    });
  }

  submitEditForm(editForm: FormGroup) {
    let student: Student = editForm.value;
    console.log("Student");
    console.log(student);
    this.studentService.updateProductById(student, this.id).subscribe(data => {
      console.log("Success ");
      this.backToList();
    });
  }

  backToList() {
    this.router.navigateByUrl("list");
  }

}
