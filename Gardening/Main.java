#include<iostream>
#include<cmath>
using namespace std;
int main(void) {
  int rows = 0, cols = 0, tree = 0;
  int treeRow = 0, treeCol = 0;
  cin >> rows >> cols >> tree;
  treeRow = ceil((float)tree / rows);
  if(treeRow == 2 || (rows - treeRow == 1)) {
    cout << "It is a mango tree\n";
  }
  else {
    cout << "It is not a mango tree\n";
  }
  return 0;
}