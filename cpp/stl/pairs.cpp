#include <bits/stdc++.h>

using namespace std;

int main() {

    // pair<int, int> p = {1, 3};

    // cout << p.first << endl;
    // cout << p.second << endl;

    // pair<int, pair<int, int>> p2 = {1, {2, 3}};
    // cout << p2.second.first << endl;

    // pair<int, int> arr[] = {{1, 2}, {3, 4}, {5, 6}};

    // cout << arr[0].first << endl;

    pair<int, string> a;
    a = make_pair(2, "abc");
    pair<int, string> &b = a;
    b.first = 7;
    cout << "a.first: "  << a.first << endl;

    int x[] = {1, 2, 3};
    int y[] = {2, 3, 4};
    pair<int, int> p_array[3];
    // p_array[0] = {x[0], y[0]};

    for (size_t i = 0; i < size(p_array); i++)
    {
        p_array[i] = {x[i], y[i]};
    }
    swap(p_array[0], p_array[2]);
    cin >> p_array[0].first;
    for (auto &&i : p_array)
    {
        cout << i.first << " " << i.second << endl;
    }
    
}