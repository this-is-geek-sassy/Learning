#include <bits/stdc++.h>

using namespace std;

void print(unordered_map<int, string> &p) {
    cout << "p.size() : " << p.size() << endl;
    for (auto &&pr : p)
    {
        cout << pr.first << "^^^" << pr.second << "%%%%%%%%%%%%";
    }
    cout << endl;    
}

int main() {

    // Normal maps (RBTs): insert, update, find, erase: O(logn)
    // Urordered maps
    // Multi-maps

    unordered_map<int, string> m;
    m[1] = "abc";
    m[5] = "cdc";
    m[3] = "ecd";

    m.insert({4, "afg"});
    m[3] = "saswata";    // update

    // unordered_map<int, string> :: iterator it_1;
    // auto it_2 = m.begin();

    // for (it_2; it_2!=m.end(); it_2++) {
    //     cout << it_2->first << "---" << it_2->second << "############";
    // }
    // cout << endl;
    print(m);

    cout << m.find(3) -> second << endl;
    // cout << (--m.find(7)) -> second << endl;
    m.erase(3);
    print(m);

    m.clear();
    print(m);
}