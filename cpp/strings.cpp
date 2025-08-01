#include <bits/stdc++.h>

using namespace std;

int main() {

    string s = "Striver";

    cout << s[0] << endl;

    int len = s.size();
    cout << len << endl;
    cout << s[len - 1] << endl;
    // cout << s[len] << endl;
    s[len-1] = 'k';
    cout << s[len - 1] << endl;
    return 0;
}