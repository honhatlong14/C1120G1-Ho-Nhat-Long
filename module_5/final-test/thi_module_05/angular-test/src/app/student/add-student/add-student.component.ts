import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {StudentService} from "../../service/student.service";
import {Student} from "../../model/Student";

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit {

  public listOrigin: string[] = [];

  createForm: FormGroup;


  constructor(private _formBuilder: FormBuilder,
              private productService:StudentService,
              private router:Router)
  { }

  ngOnInit(): void {
    this.productService.getListOrigin().subscribe(data => {
      this.listOrigin = data;
    }, error => {
      console.log("get "+error+" on add-product.component.ts")
    });

    this.createForm = this._formBuilder.group({
      id:['',[Validators.required]],
      name_student: ['',[Validators.required, Validators.pattern(/^[0-9a-zA-Z]*$/)]],
      name_group: ['',[Validators.required]],
      name_topic: ['',[Validators.required, Validators.min(10000), Validators.max(50000000)]],
      tutor: ['',[Validators.required]],
      email: ['',[Validators.required,Validators.pattern("[a-zA-Z0-9_\\.\\+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-\\.]+")]],
      phone: ['',[Validators.required,Validators.pattern("\\d{10,12}")]]
    });
  }

  submitCreateForm(createForm: FormGroup) {
    let student:Student = createForm.value;
    console.log(this.createForm.value)
    this.productService.save(student).subscribe(data => {
      this.backToList();
    }, error => {
      console.log("Get error on submitCreateForm()");
    })
  }

  backToList() {
    this.router.navigateByUrl("list");
  }
}
