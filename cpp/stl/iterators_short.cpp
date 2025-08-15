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

void print_vector_using_range_based_values (vector<int>& v) {

    cout << "print_vector_using_range_based_values: " << endl;
    for (auto &&i : v)
    {
        i++;
        cout << i << " ";
    }
    cout << endl;
}

void print_vector_using_iterators(vector<int>& v) {

    cout << "v.size() : " << v.size() << endl;   // v.size() -> O(1)

    // vector<int> :: iterator it;
    for (auto it = v.begin(); it!=v.end(); it++) {     // subtle difference b/w it+1 and it++
        cout << (*it) << " ";
    }
    cout << endl;
}


int main() {

    vector<int> v = {2, 3, 5, 6, 7};
    print_vector(v);

    vector<int> :: iterator it = v.begin();
    cout << (*it) << endl;
    cout << (*(it + 1)) << endl;

    // print_vector_using_iterators(v);
    print_vector_using_range_based_values(v);
    print_vector_using_iterators(v);
}