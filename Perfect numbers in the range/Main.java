#include<iostream>
using namespace std;
int main(void) {
  int start = 0, end = 0, divSum = 0;
  cin >> start >> end;
  if(start == 1) {
    start++;
  }
  for(int n = start; n <= end; ++n) {
    divSum = 1;
    for(int i = 2;i <= n / 2; ++i) {
      if(n % i == 0) {
        divSum += i;
      }
    }
    if(divSum == n) {
      cout << n << " ";
    }
  }
  return 0;
}