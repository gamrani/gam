export class Student{
  id:number;
  lastName:string;
  firstName:string;
  age:number;
  cin:string;
  numeroApogee:number;
  numeroNational:number;

  constructor(id:number,lastName:string,firstName:string,age:number,cin:string,num:number,numeroNational:number){
     this.id=id;
     this.lastName=lastName;
     this.firstName=firstName;
     this.age=age;
     this.cin=cin;
     this.numeroApogee=num;
     this.numeroNational=numeroNational;
  }
 
}