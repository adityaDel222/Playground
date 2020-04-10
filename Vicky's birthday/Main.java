#include<iostream>
using namespace std;
int main(void) {
  int year = 0;
  cin >> year;
  if(year % 4 == 0) {
    if(year % 100 != 0) {
      cout << "Vicky can celebrate his birthday.\n";
    }
    else if (year % 400 == 0) {
      cout << "Vicky can celebrate his birthday.\n";
    }
    else {
      cout << "Vicky can't celebrate.\n";
    }
  }
  else {
    cout << "Vicky can't celebrate.\n";
  }
  return 0;
}