#include<iostream>
using namespace std;
int main(void) {
  int radius = 0, side = 0;
  cin >> radius >> side;
  if(radius <= side / 2) {
    cout << "circle can be inside a square\n";
  }
  else {
    cout << "circle cannot be inside a square\n";
  }
  return 0;
}