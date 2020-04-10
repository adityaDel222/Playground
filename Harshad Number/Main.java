#include<iostream>
using namespace std;
int main(void) {
  int n = 0, m = 0, rem = 0, sumOfDigits = 0;
  cin >> n;
  m = n;
  while(m > 0) {
    rem = m % 10;
    sumOfDigits += rem;
    m /= 10;
  }
  if(n % sumOfDigits == 0) {
    cout << "Harshad Number\n";
  }
  else {
    cout << "Not Harshad Number\n";
  }
  return 0;
}