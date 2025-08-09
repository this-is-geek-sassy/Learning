#include <bits/stdc++.h>

using namespace std;

int main() {

    pair<int, int> p = {1, 3};

    cout << p.first << endl;
    cout << p.second << endl;

    pair<int, pair<int, int>> p2 = {1, {2, 3}};
    cout << p2.second.first << endl;

    pair<int, int> arr[] = {{1, 2}, {3, 4}, {5, 6}};

    cout << arr[0].first << endl;

    pair<int, string> a;
    a = make_pair(2, "abc");
    cout << a.first << endl;
}