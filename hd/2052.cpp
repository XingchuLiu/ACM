#include<iostream>
using namespace std;
int main(){
	int m,n;
	while(cin >> m >> n){
		cout << '+';
		for(int i = 0; i < m; i++){
			cout << '-';
		}
		cout << '+' << endl;
		for(int i = 0; i < n; i++){
			cout << '|';
			for(int j = 0; j < m; j++){
				cout << ' ';
			}
			cout << '|' << endl;
		}
		cout << '+';
		for(int i = 0; i < m; i++){
			cout << '-';
		}
		cout << '+' << endl << endl;
	}
}
