#include<iostream>
using namespace std;
int main(void) {
  int rows = 0, cols = 0, tree = 0;
  cin >> rows >> cols >> tree;
  if(tree <= cols || tree % cols == 0 || tree % cols == 1) {
    cout << "Yes\n";
  }
  else {
    cout << "No\n";
  }
  return 0;
}