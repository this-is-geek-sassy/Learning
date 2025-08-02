#include <bits/stdc++.h>

using namespace std;

int main() {

    int n;
    cin >> n;
    int* arr = new int[n];  // dynamic array (in heap)

    for (size_t i = 0; i < n; i++)
    {
        cin >> arr[i];  // input elements into the dynamic array
    }
    
    for (int i = 0; i < n; i++) {
        cout << arr[i] << '\t';
    }
    delete arr;
}