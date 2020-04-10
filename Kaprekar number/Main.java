#include<iostream>
#include<cmath>
using namespace std;
int main(void) {
  int n = 0;
  cin >> n;
  int m = n;
  int mDigits = 0;
  while(m > 0) {
    m /= 10;
    mDigits++;
  }
  int sq_N = n * n;
  int sq_NPlace = pow(10, mDigits);
  int sq_N1 = sq_N / sq_NPlace;
  int sq_N2 = sq_N % sq_NPlace;
  if(sq_N1 + sq_N2 == n) {
    cout << "Kaprekar Number\n";
  }
  else {
    cout << "Not a Kaprekar Number\n";
  }
  return 0;
}