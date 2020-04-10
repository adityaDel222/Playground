#include<iostream>
using namespace std;
int main(void) {
  int birthYear = 0, currentYear = 0, age = 0;
  cin >> birthYear >> currentYear;
  /*if(currentYear >= 00 && currentYear <= 20) {
    if(birthYear > 20 && birthYear <= 99) {
      age = 100 - birthYear + currentYear;
    }
    else {
      age = currentYear - birthYear;
    }
  }
  else {
    age = currentYear - birthYear;
  }*/
  if(currentYear >= birthYear) {
    age = currentYear - birthYear;
  }
  else {
    age = 100 - birthYear + currentYear;
  }
  cout << age << endl;
  return 0;
}