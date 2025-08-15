#include <bits/stdc++.h>

using namespace std;

void print(set<string> &s) {

    for (auto &&str : s)
    {
        cout << str << " ";
    }
    cout << endl;

    // for (auto it = s.begin(); it != s.end(); it++)
    // {
    //     cout << (*it) << " ";
    // }
    // cout << endl;
}

int main() {

    // unordered_set<string> s;      // O(1) time complexity

    set<string> s;
    s.insert("abc");
    s.insert("zy");
    s.insert("bcd");    // O(log n)
    s.insert("abc");
    auto it = s.find("abcd");  // O(log n)
    if (it != s.end()) {
        // cout << *it << endl;
        s.erase(it);
    }
    s.erase("zy");
    print(s);
}