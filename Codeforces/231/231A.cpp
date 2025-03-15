#include <iostream>
using namespace std;

int main(){
    int problemCount, implementedCount = 0, p, v, t;

    cin >> problemCount;

    for(int i = 0; i < problemCount; i++){
        cin >> p >> v >> t;
        if(p + v + t > 1){
            implementedCount++;
        }
    }
    cout << implementedCount << endl;

    return 0;
}