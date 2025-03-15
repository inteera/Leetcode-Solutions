#include <iostream>
using namespace std;

int main(){
    int distance, steps = 0;
    cin >> distance;
    
    while(distance > 0){
        distance -= 5;
        steps++;
    }

    cout << steps << endl;

    return 0;
}