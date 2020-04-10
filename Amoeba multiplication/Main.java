#include<iostream>
using namespace std;
int main(void) {
  int m = 0, a = 0, b = 0, sum = 0;
  cin >> m;
  a = 0;
  b = 1;
  for(int i = 0; i < m - 2; ++i) {
    sum = a + b;
    a = b;
    b = sum;
  }
  cout << sum << endl;
  return 0;
}