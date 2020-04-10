#include<iostream>
using namespace std;
int main(void) {
  int units = 0, extra = 0, net = 0;
  float rate = 0.0;
  cin >> units;
  if(units <= 200) {
    rate = 0.5;
  }
  else if(units <= 400) {
    rate = 0.65;
    extra = 100;
  }
  else if(units <= 600) {
    rate = 0.80;
    extra = 200;
  }
  else {
    rate = 1.25;
    extra = 425;
  }
  net = units * rate + extra;
  cout << "Rs." << net;
  return 0;
}