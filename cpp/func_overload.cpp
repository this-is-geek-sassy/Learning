#include <bits/stdc++.h>

using namespace std;

namespace stuffs
{
    int sum (int a, int b) {
        return a*b;
    }

    int cout (std::string num) {
        return std::stoi(num);
    }
} // namespace stuffs


int sum (int a, int b) {
    return a+b;
}
// overloading sum function
double sum (double a, double b) {
    return a+b;
}

int main() {

    cout << sum(1,2) << endl;
    cout << sum(31.5, 12.3) << endl;

    cout << stuffs::sum(2,3) << endl;

    cout << stuffs::cout("345jk") << endl;
}