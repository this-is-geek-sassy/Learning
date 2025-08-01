#include <bits/stdc++.h>

using namespace std;

// pass by reference
void doSomething (string &s) {
    s[0] = 't';
    cout << s << endl;
}

// array always passed by reference (only exception)
void doSomethingToArrary(int arr[], int n) {
    arr[0] += 100;
    cout << "Value inside the function: " << arr[0] << endl;
}

int main() {
    string s = "fbwbvv";

    doSomething(s);
    cout << s << endl;

    int arr[5];

    for (size_t i = 0; i < 5; i++)
    {
        cin >> arr[i];
    }
    for (size_t i = 0; i < 5; i++)
    {
        cout << arr[i] << '\t';
    }

    cout << endl << typeid(arr).name() << endl;
    
    doSomethingToArrary(arr, 5);
    cout << "Value inside int min: " << arr[0] << endl;
}