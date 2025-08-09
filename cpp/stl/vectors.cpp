#include <bits/stdc++.h>

using namespace std;

void print_vector(vector<int>& v) {    // not making a copy -> O(1)

    cout << "v.size() : " << v.size() << endl;   // v.size() -> O(1)

    for (size_t i = 0; i < v.size(); i++)
    {
        cout << v[i] << " ";
    }
    cout << endl;
    
}

int main() {

    int a[10];
    vector<int> v;   // 0 memory now
    int n;
    cin >> n;

    for (size_t i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        v.push_back(x);    // pushes back value to the end of vector; time complexity: O(1)
    }
    print_vector(v);

    vector<int> j(n);
    print_vector(j);

    v.pop_back();   // O(1)
    print_vector(v);

    vector<int> v2 = v;  // O(n)
    print_vector(v2);
}