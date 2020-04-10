#include<iostream>
using namespace std;
int main(void) {
  int n = 0;
  cin >> n;
  (n % 2 == 0) ? cout << "Even" : cout << "Odd";
  return 0;
}