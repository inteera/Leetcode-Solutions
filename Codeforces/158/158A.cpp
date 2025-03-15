#include <iostream>
using namespace std;

int main(){
    int contestantCount, checkIndex, betterScoreCount = 0;
    cin >> contestantCount >> checkIndex;
    checkIndex--;

    int scores[contestantCount];

    for(int i = 0; i < contestantCount; i++){
        cin >> scores[i];
    }

    for(int score : scores){
        if(score >= scores[checkIndex] && score > 0){
            betterScoreCount++;
        }
        else{
            break;
        }
    }
    cout << betterScoreCount;

    return 0;
}