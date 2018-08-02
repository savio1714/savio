#include "Staff.h"
#include "string.h"
#include <iostream>

Staff::Staff()
{
    cout << "Staff Object Created" << endl;
}

Staff::~Staff()
{
    cout << "Staff Object Destroyed" << endl;
}

Staff::Staff(string firstname){
    cout << "First Name" << endl;
    this->firstname=firstname;
}

Staff::Staff(string firstname,string lastname){
    cout << "First Name + Last Name" << endl;
    this->firstname=firstname;
    this->lastname=lastname;
    cout << "First Name:  " << firstname << endl;
    cout << "Last Name:  " << lastname << endl;
}

string Staff::getFullName(){
return this->firstname + " " + this->lastname;
}
