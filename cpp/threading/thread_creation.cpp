#include <bits/stdc++.h>
#include <thread>

using namespace std;

// void fun(int x) {
//     while (x-- > 0)
//         cout << x << endl;
// }

// int main() {

//     thread t1(fun, 10);
//     thread t2(fun, 5);
//     t1.join();
//     t2.join();

//     fun(10);
// }

// Lambda expression
// int main() {

//     // auto fun = [] (int x) {
//     //     while (x-- > 0)
//     //     {
//     //         cout << x << " ";
//     //     }
//     //     cout << endl;
//     // };
//     thread t([] (int x) {
//         while (x-- > 0)
//         {
//             cout << x << " ";
//         }
//         cout << endl;
//     }, 10);
//     t.join();
// }

// Functor
// class Base {
// public:
//     void operator () (int x){
//         while (x-- > 0)
//         {
//             cout << x << " ";
//         }
//         cout << endl;
//     }
// };

// int main() {

//     // Base b;
//     // b(18);
//     thread t(Base(), 10);
//     t.join();
// }


// Non static member function
// class Base {
// public:
//     void run (int x){
//         while (x-- > 0)
//         {
//             cout << x << " ";
//         }
//         cout << endl;
//     }
// };

// int main() {
//     Base b;
//     thread t(&Base::run, &b, 15);
//     t.join();
// }


// static member function
class Base {
public:
    static void run (int x){
        while (x-- > 0)
        {
            cout << x << " ";
        }
        cout << endl;
    }
};

int main() {
    // Base b;
    thread t(&Base::run, 15);
    t.join();
}