#include<iostream>
using namespace std;
int main(void) {
  int maxWeight = 0, florenceWeight = 0;
  cin >> maxWeight >> florenceWeight;
  if(florenceWeight < maxWeight) {
    cout << "Yes, you can enter.\n";
  }
  else if(florenceWeight == maxWeight) {
    cout << "Yes, you can enter. Kindly use a rope.\n";
  }
  else {
    cout << "Sorry, you can't enter\n";
  }
  return 0;
}