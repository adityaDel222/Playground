#include<iostream>
using namespace std;
int main(void) {
  int nE = 0, nT = 0;
  cin >> nE >> nT;
  int n = nE + nT;
  int divSum = 1;
  for(int i = 2; i <= n / 2; ++i) {
    if(n % i == 0) {
      divSum += i;
    }
  }
  if(divSum == n) {
    cout << "They can read the message\n";
  }
  else {
    cout << "They can't read the message\n";
  }
  return 0;
}