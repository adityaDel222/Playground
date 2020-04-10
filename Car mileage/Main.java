#include<iostream>
using namespace std;
int main(void) {
  int petrol = 0, distance = 0;
  float mileage = 0.0;
  cin >> mileage >> petrol >> distance;
  if(petrol * mileage >= distance) {
    cout << "Can reach\n";
  }
  else {
    cout << "Cannot reach\n";
  }
  return 0;
}