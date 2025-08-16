#include <bits/stdc++.h>
#include <chrono>
#include <thread>

using namespace std;

void run(int count) {
    while (count-- > 0)
    {
        cout << count << " Saswata" << " ";
    }
    cout << endl;
    this_thread::sleep_for(chrono::seconds(3));
    cout << "thread finished\n";
}
int main() {

    thread t1(run, 10);
    cout << "main()" << endl;
    // t1.join();
    // if (t1.joinable())
    //     t1.join();
    t1.detach();
    cout << "main() after" << endl;
}