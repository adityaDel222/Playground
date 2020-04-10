#include<iostream>
using namespace std;
int main(void) {
  int ice_stones = 0;
  cin >> ice_stones;
  int isPair = ice_stones % 2;
  (isPair == 0) ? cout << "Possible" : cout << "Not possible";
  return 0;
}