import { Injectable } from '@angular/core';
import {Student} from '../students/Student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor() { }
  
  getStudentsAll(){
    return [new Student(1,"aaaaaa","bbbbbbb",20,"dddddd",3,4),new Student(2,"c","d",3,"dcd",4,4)];
  }

}
