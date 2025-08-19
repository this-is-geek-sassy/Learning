#include <bits/stdc++.h>
#include <chrono>
#include <thread>

typedef unsigned long long ull;
using namespace std;

ull odd_sum = 0;
ull even_sum = 0;

void find_even(ull start, ull end) {
    ull local_sum = 0;
    for (ull i = start; i <= end; i++) {
        if ((i & 1) == 0)
            local_sum += i;
    }
    even_sum = local_sum;
}

void find_odd(ull start, ull finish) {
    ull local_sum = 0;
    for (ull i = start; i <= finish; i++)
    {
        if ((i & 1) == 1)
            local_sum += i;
    }
    odd_sum = local_sum;
}

string decimalToBinary(ull n) {
    string result = "";
    while (n > 0) {
        result = char('0' + (n % 2)) + result;
        n /= 2;
    }
    return result.empty() ? "0" : result;
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

    string bin = decimalToBinary(odd_sum);
    cout << bin << " " << bin.length() << endl;


    start_time = chrono::steady_clock::now();
    for (auto i=1; i<= pow(2, 31); i++) {
        continue;
    }
    end_time = chrono::steady_clock::now();
    elapsed_seconds = end_time - start_time;
    cout << "Elapsed time: " << elapsed_seconds.count() << "s\n";
}