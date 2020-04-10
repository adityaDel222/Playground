#include<iostream>
using namespace std;
int main(void) {
  int d1 = 0, c1 = 0, d2 = 0, c2 = 0, D = 0, C = 0;
  cin >> d1 >> c1 >> d2 >> c2;
  D = d1 + d2 + (c1 + c2) / 100;
  C = (c1 + c2) % 100;
  cout << D << endl << C << endl;
  return 0;
}