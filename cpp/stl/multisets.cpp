#include <bits/stdc++.h>
// link: https://www.hackerearth.com/practice/data-structures/trees/heapspriority-queues/practice-problems/algorithm/monk-and-the-magical-candy-bags/
using namespace std;

int main() {

    int t;
    cin >> t;
    while(t--) {
        int n, k;
        cin >> n >> k;

        multiset<long long int> bags;
        for (size_t i = 0; i < n; i++)
        {
            long long candy_cnt;
            cin >> candy_cnt;
            bags.insert(candy_cnt);
        }
        long long total_candies = 0;
        for (size_t i = 0; i < k; i++)
        {
            auto last_itr = (--bags.end());
            long long candy_cnt = (*last_itr);

            total_candies += candy_cnt;
            
            bags.erase(last_itr);
            bags.insert(candy_cnt/2);
        }
        cout << total_candies << endl;
    }
}