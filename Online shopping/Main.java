#include<iostream>
using namespace std;
int main(void) {
  int FP = 0, FD = 0, FS = 0, SP = 0, SD = 0, SS = 0, AP = 0, AD = 0, AS = 0;
  float FNet = 0.0, SNet = 0.0, ANet = 0.0;
  string low = "";
  cin >> FP >> FD >> FS >> SP >> SD >> SS >> AP >> AD >> AS;
  FNet = FP - ((float)FD * FP / 100) + FS;
  SNet = SP - ((float)SD * SP / 100) + SS;
  ANet = AP - ((float)AD * AP / 100) + AS;
  if(FNet <= SNet) {
    if(FNet <= ANet) {
      low = "Flipkart";
    }
    else {
      low = "Amazon";
    }
  }
  else {
    if(SNet <= ANet) {
      low = "Snapdeal";
    }
    else {
      low = "Amazon";
    }
  }
  cout << "In Flipkart Rs." << FNet;
  cout << "\nIn Snapdeal Rs." << SNet;
  cout << "\nIn Amazon Rs." << ANet;
  cout << "\nHe will prefer " << low << endl;
  return 0;
}