#include<iostream>
using namespace std;
int main(void) {
  int w = 0, x = 0, y = 0, profit = 0;
  cin >> w >> x >> y;
  profit = w * (x - y) - 100;
  cout << profit;
  return 0;
}