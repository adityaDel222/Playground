#include<iostream>
using namespace std;
int main(void) {
  int n1 = 0, n2 = 0;
  cin >> n1 >> n2;
  if(n1 <= n2) {
    cout << n1 << " is smallest number\n";
  }
  else {
    cout << n2 << " is smallest number\n";
  }
  return 0;
}