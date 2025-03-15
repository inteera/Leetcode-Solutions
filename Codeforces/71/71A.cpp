#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    string list[n];

    for(int i = 0; i < n; i++){
        cin >> list[i];
        if(list[i].length() > 10){
            list[i] = list[i].at(0) + to_string(list[i].length() - 2) + list[i].at(list[i].length() - 1);
        }
    }

    for(string element : list){
        cout << element << endl;
    }

    return 0;
}