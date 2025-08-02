#include <bits/stdc++.h>

using namespace std;

double calculate_sum(double arr[], int n) {

    double t = 0;
    for (size_t i = 0; i < n; i++)
    {
        t += arr[i];
    }
    return t;
}

double calculate_sum(double& arr, int n) {    // wrong method signature, pass by ref. does not work this way

    cout << arr <<endl;
}

int main() {

    double arr[] = {45.6, 34, 23, 12.3, 23.5};

    size_t size = sizeof(arr)/sizeof(arr[0]);
    double sum = calculate_sum(arr, size);
    cout << sum << endl;
}