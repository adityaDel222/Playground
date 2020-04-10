#include<iostream>
using namespace std;
int main(void) {
  int n = 0, res = 0;
  cin >> n;
  if(n >= 4) {
    res = n * (n - 1) / 2;
  }
  else if(n == 3) {
    res = 3;
  }
  else if(n == 2) {
    res = 1;
  }
  else {
    res = 0;
  }
  cout << res << endl;
  return 0;
}