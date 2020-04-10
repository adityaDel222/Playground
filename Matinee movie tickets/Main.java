#include<iostream>
#include<cstdio>
using namespace std;
int main(void) {
  int age = 0;
  float price = 0.0;
  string timing = "";
  cin >> age >> timing;
  if(age <= 13) {
    if(timing == "13.30") {
      price = 2.00;
    }
    else {
      price = 4.00;
    }
  }
  else {
    if(timing == "13.30") {
      price = 5.00;
    }
    else {
      price = 8.00;
    }
  }
  printf("$%0.2f\n", price);
  return 0;
}