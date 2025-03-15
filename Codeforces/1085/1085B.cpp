#include <iostream>
using namespace std;

int main(){
    int n, k;
    cin >> n >> k;

    for(int x = 0; x < n; x++){
        if((x/k)*(x%k) == n){
            cout << x;
            return 0;
        }
    }

    return 0;
}