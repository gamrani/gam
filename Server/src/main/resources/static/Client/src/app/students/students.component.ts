import { Component, OnInit } from '@angular/core';
import {Student} from './Student';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {
  persons: Student[] = [];
  showStudent:boolean;
  constructor() { }
  ngOnInit() {
    this.showStudent=true;
    this.persons= [new Student(1,"a","b",2,"dd",3,4),new Student(2,"c","d",3,"dcd",4,4)];
  }

  addStudent(){this.showStudent=false;}
  deleteStudent(id){console.log("Supprimer l'utilisateur"+id)}
  editStudent(id){console.log("modifier l'utilsiateur"+id)}
  studentInformations(id){console.log("info de student"+id)}
}
