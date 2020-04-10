#include<iostream>
#include<cmath>
using namespace std;
int main(void) {
  int num = 0, lastDigit = 0, firstDigit = 0, sumLastFirstDigits = 0;
  cin >> num;
  num = abs(num);
  lastDigit = num % 10;
  firstDigit = num / 1000;
  sumLastFirstDigits = lastDigit + firstDigit;
  cout << sumLastFirstDigits;
  return 0;
}