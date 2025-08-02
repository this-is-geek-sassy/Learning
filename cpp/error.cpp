#include <bits/stdc++.h>

using namespace std;

int main() {
    cout << "hello" << endl;
    // throw 3;
    try {
        throw "2";
    } catch (int error) {
        cout << "Some Error! Oh no! Error: " << error << endl;
    } catch (...) {
        cout << "Oh no! Some other error!" << endl;
    }
    cout << "bye" << endl;
}