#include<iostream>
using namespace std;
int main(void) {
  string id = "";
  int marks = 10;
  cin >> id >> marks;
  if(marks > 0) {
    cout << id << " is eligible for reward.\n";
  }
  return 0;
}