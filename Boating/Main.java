#include<iostream>
using namespace std;
int main(void) {
  int maxWeight = 0, numAdults = 0, numChildren = 0, totalWeight = 0;
  cin >> maxWeight >> numAdults >> numChildren;
  totalWeight = numAdults * 75 + numChildren * 30;
  if(totalWeight <= maxWeight) {
    cout << "Boat is stable\n";
  }
  else {
    cout << "Boat will drow\n";
  }
  return 0;
}