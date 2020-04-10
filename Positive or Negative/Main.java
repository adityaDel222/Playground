#include<iostream>
using namespace std;
int main(void) {
  int n = 0;
  cin >> n;
  if(n >= 0) {
    cout << n << " is a positive number.\n";
  }
  else {
    cout << n << " is a negative number.\n";
  }
  return 0;
}