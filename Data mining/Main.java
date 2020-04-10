#include<iostream>
using namespace std;
int main(void) {
  int n = 0;
  cin >> n;
  int rem = 0;
  int evenSum = 0;
  int oddSum = 0;
  while(n > 0) {
    rem = n % 10;
    if(rem % 2 == 0) {
      evenSum += rem;
    }
    else {
      oddSum += rem;
    }
    n /= 10;
  }
  if(evenSum == oddSum) {
    cout << "Yes\n";
  }
  else {
    cout << "No\n";
  }
  return 0;
}