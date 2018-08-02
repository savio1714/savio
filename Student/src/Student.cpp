#include "Student.h"
#include "string.h"
#include <iostream>

Student::Student()
{
    cout << "Student Object Created" << endl;
}

Student::~Student()
{
    cout << "Student Object Destroyed" << endl;
}

Student::Student(string firstname,string lastname){
    cout << "First Name + Last Name" << endl;
    this->firstname=firstname;
    this->lastname=lastname;
    cout << "First Name:  " << firstname << endl;
    cout << "Last Name:  " << lastname << endl;
}
Student::Student(string firstname,string lastname,int rollno){
    cout << "First Name + Last Name + Roll Number" << endl;
    this->firstname=firstname;
    this->lastname=lastname;
    this->rollno=rollno;
    cout << "First Name:  " << firstname << endl;
    cout << "Last Name:  " << lastname << endl;
    cout << "Roll Number:  " << rollno << endl;
}

Student::Student(string firstname,string lastname,int rollno,string STD){
    cout << "First Name + Last Name + Roll Number + STD" << endl;
    this->firstname=firstname;
    this->lastname=lastname;
    this->rollno=rollno;
    this->STD=STD;
    cout << "First Name:  " << firstname << endl;
    cout << "Last Name:  " << lastname << endl;
    cout << "Roll Number:  " << rollno << endl;
    cout << "STD:  " << STD<< endl;
}
/*string Student::getFullName(){
return this->firstname + " " + this->lastname +" "+ this->rollno +" "+  this->STD ;
}*/
