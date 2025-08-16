#include <bits/stdc++.h>
#include <chrono>
#include <thread>

typedef unsigned long long ull;
using namespace std;

ull odd_sum = 0;
ull even_sum = 0;

void find_even(ull start, ull end) {
    for (ull i = start; i <= end; i++) {
        if ((i & 1) == 0)
            even_sum += i;
    }
}

void find_odd(ull start, ull finish) {
    for (ull i = start; i <= finish; i++)
    {
        if ((i & 1) == 1)
            odd_sum += i;
    }
}

int main() {

    auto start_time = chrono::steady_clock::now();

    ull start = 0, end = 1900000000;

    thread t1(find_even, start, end);
    thread t2(find_odd, start, end);

    t1.join();
    t2.join();

    // find_odd(start, end);
    // find_even(start, end);
    auto end_time = chrono::steady_clock::now();

    cout << "Odd sum : " << odd_sum << endl;
    cout << "even sum : " << even_sum << endl;

    chrono::duration<double> elapsed_seconds = end_time - start_time;
    cout << "Elapsed time: " << elapsed_seconds.count() << "s\n";
}