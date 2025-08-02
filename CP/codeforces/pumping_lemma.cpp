#include <iostream>
#include <vector>
#include <string>

using namespace std;

// Function to count valid splits
int countValidSplits(const string& s, const string& t) {
    int n = s.length();
    int m = t.length();
    int count = 0;

    for (int i = 0; i < n; ++i) { // i = start of y
        for (int len = 1; i + len <= n; ++len) { // len = length of y
            string x = s.substr(0, i);
            string y = s.substr(i, len);
            string z = s.substr(i + len);

            // Try to form t = x + y*k + z
            if (x.size() + z.size() > t.size()) continue;
            if (t.substr(0, x.size()) != x) continue;
            if (t.substr(t.size() - z.size()) != z) continue;

            int rem = t.size() - x.size() - z.size(); // remaining length to be filled with y^k
            if (rem % y.size() != 0) continue;

            int k = rem / y.size();
            string mid = "";
            for (int j = 0; j < k; ++j)
                mid += y;
            if (t.substr(x.size(), rem) == mid)
                ++count;
        }
    }

    return count;
}

int main() {
    int n, m;
    string s, t;
    cin >> n >> m >> s >> t;
    cout << countValidSplits(s, t) << endl;
    return 0;
}
