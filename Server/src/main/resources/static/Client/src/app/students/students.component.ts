import { Component, OnInit } from '@angular/core';
import {Student} from './Student';
import { StudentService } from '../services/student.service';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {
  persons: Student[] = [];
  showStudent:boolean;

  constructor(private _studentService:StudentService) { }
  
  ngOnInit() {
    this.showStudent=true;
    this.persons = this._studentService.getStudentsAll();
  }

  addStudent(){this.showStudent=false;}
  deleteStudent(id){console.log("Supprimer l'utilisateur"+id)}
  editStudent(id){console.log("modifier l'utilsiateur"+id)}
  studentInformations(id){console.log("info de student"+id)}
}
