import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Student} from "../model/Student";

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private _API_URL_STUDENT: string = 'http://localhost:8080/listStudent';
  // private _API_URL_STUDENT: string = 'http://localhost:8080/listStudent';


  constructor(private _httpClient: HttpClient) { }


  getListStudent(): Observable<Student[]> {
    return this._httpClient.get<Student[]>(this._API_URL_STUDENT);
  }

  getProductById(id:number): Observable<Student> {
    return this._httpClient.get<Student>(`${this._API_URL_STUDENT}/${id}`);
  }

  updateProductById(student: Student, id:number): Observable<Student> {
    return this._httpClient.put<Student>(`${this._API_URL_STUDENT}/${id}`, student);
  }

  deleteStudentById(id:number): Observable<Student> {
    return this._httpClient.delete<Student>(`${this._API_URL_STUDENT}/${id}`);
  }

  save(student: Student):Observable<Student> {
      return this._httpClient.post<Student>(this._API_URL_STUDENT, student);
  }

  getListOrigin():Observable<string[]> {
      return this._httpClient.get<string[]>(this._API_URL_STUDENT)
  }
}
