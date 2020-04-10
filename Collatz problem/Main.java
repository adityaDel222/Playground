#include<iostream>
using namespace std;
int main(void) {
  int n = 0, step = 0;
  cin >> n;
  cout << n << endl;
  while(n > 1) {
    if(n % 2 == 0) {
      n /= 2;
    }
    else {
      n = 3 * n + 1;
    }
    cout << n << endl;
    step++;
  }
  cout << step << endl;
  return 0;
}