#include <bits/stdc++.h>

using namespace std;

void print_vector(vector<pair<int, int>>& v) {    // not making a copy -> O(1)

    cout << "v.size() : " << v.size() << endl;   // v.size() -> O(1)

    for (size_t i = 0; i < v.size(); i++)
    {
        cout << v[i].first << "--";
        cout << v[i].second << " ";
    }
    cout << endl;
    
}

void print_2d_vec(vector<vector<int>>& v) {

    cout << "Size of the 2D vector: " << v.size() << endl;
    for (size_t i = 0; i < v.size(); i++)
    {
        for (size_t j = 0; j < v[i].size(); j++)
        {
            cout << v[i][j] << " ";
        }
        cout << endl;
        
    }
    
}

int main() {
    
    vector<pair<int, int>> v = {{1, 2}, {2, 3}, {3, 5}};
    print_vector(v);

    vector<vector<int>> v2;
    int N;
    cin >> N;

    for (size_t i = 0; i < N; i++)
    {
        int n;
        cin >> n;
        vector<int> v_s;
        for (size_t j = 0; j < n; j++)
        {
            int x;
            cin >> x;
            v_s.push_back(x);
        }
        v2.push_back(v_s);
    }
    print_2d_vec(v2);
}