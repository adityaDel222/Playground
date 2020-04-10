#include<iostream>
using namespace std;
int main(void) {
  int x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
  float x4 = 0.0, y4 = 0.0;
  cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;
  x4 = (float)(x1 + x2 + x3) / 3;
  y4 = (float)(y1 + y2 + y3) / 3;
  cout << x4 << "\n" << y4;
  return 0;
}