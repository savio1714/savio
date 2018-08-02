#ifndef STUDENT_H
#define STUDENT_H
#include "string.h"
#include <iostream>

using namespace std;

class Student
{

    protected:
        string firstname;
        string lastname;
        int rollno;
        string STD;

    public:
        Student();
         ~Student();
         Student(string firstname,string lastname);
         Student(string firstname,string lastname,int rollno);
         Student(string firstname,string lastname,int rollno,string STD);
         string getFirstName(){return this->firstname;}
         string getLastNmae(){return this->lastname;}
         int getRollNo(){return this->rollno;}
         string getSTD(){return this->STD;}

    private:
};

#endif // STUDENT_H
