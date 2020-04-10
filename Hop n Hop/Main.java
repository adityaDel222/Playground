#include<iostream>
#include<cmath>
using namespace std;
int main(void) {
  int x = 0, y = 0, hops = 0;
  cin >> x >> y;
  hops = sqrt((x - 3) * (x - 3) + (y - 4) * (y - 4));
  cout << hops;
  return 0;
}