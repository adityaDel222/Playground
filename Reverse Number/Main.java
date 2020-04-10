#include<iostream>
using namespace std;
int main(void) {
  int n = 0, rem = 0, rev = 0;
  cin >> n;
  while(n > 0) {
    rem = n % 10;
    rev = rev * 10 + rem;
    n /= 10;
  }
  cout << rev << endl;
  return 0;
}