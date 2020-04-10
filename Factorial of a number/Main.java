#include<iostream>
using namespace std;
int main(void) {
  int num = 0, factorial = 1;
  cin >> num;
  for(int i = num; i >= 1; --i) {
    factorial *= i;
  }
  cout << factorial << endl;
}