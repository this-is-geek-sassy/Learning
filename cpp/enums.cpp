#include <bits/stdc++.h>

using namespace std;

namespace hello
{
    enum ErrorNum {
        A,  //0
        B,  //1
        C,  //2
        D,  //3
        E = 99,  //99
        F,  // 100
        G,
        H
    };
} // namespace hello


int main() {

    enum ErrorNum {
        UserInputError,
        AsyncError,
        ProcessError
    };

    ErrorNum err = UserInputError;
    hello::ErrorNum err2 = hello::ErrorNum::C;
    cout << "Error no: " << hello::C << endl;
    cout << "Error no: " << err << endl;
    cout << "Error no: " << err2 << endl;
}