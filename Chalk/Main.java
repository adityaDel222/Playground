#include<iostream>
#include<cmath>
using namespace std;
int main(void) {
  int n = 0, res = 0;
  cin >> n;
  res = n + floor(sqrt(n)) + 1;
  cout << res;
  return 0;
}