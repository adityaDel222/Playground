#include<iostream>
using namespace std;
int main(void) {
  int n = 0, digitCount = 0;
  cin >> n;
  do {
    n = n / 10;
    digitCount++;
  } while(n > 0);
  cout << digitCount << endl;
  return 0;
}