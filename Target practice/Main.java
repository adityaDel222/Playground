#include<iostream>
using namespace std;
int main(void) {
  int target = 0;
  int score = 0;
  int total = 0;
  int turns = 0;
  cin >> target;
  do {
    cin >> score;
    total += score;
    turns++;
  } while(total < target);
  cout << "The number of turns is " << turns << endl;
  return 0;
}