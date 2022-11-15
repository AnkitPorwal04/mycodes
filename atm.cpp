#include<iostream>
using namespace std;
int bal = 15000;
int main(){
    int pin,chances=3,ch,amt;
    while(chances>=1){
        cout<<"Enter Pin: ";
        cin>>pin;
        if(pin==1111||pin==2222||pin==3333){
            cout<<"Pin Verified\n";
            while(1){
                cout<<"1.Balance\n2.DEposit\n3.Withdraw\n4.exit\nSelect Option: ";
                cin>>ch;
                switch(ch)
                {
                    case 1:
                    cout<<"Available Balance: "<<bal<<"\n";
                    break;
                    case 2:
                    cout<<"Enter amount";
                    cin>>amt;
                    if (amt%100 == 0){
                        bal += amt;
                        cout<<"Available Balance: "<<bal<<"\n";}
                    else{
                        cout<<"Invalid Format\n";
                    }
                    break;
                    case 3:
                    cout<<"Enter Amount: ";
                    cin>>amt;
                    if(amt%100 == 0){
                        if(amt<=bal){
                            bal -= amt;
                            cout<<"Available Balance: "<<bal<<"\n";
                        }
                        else{
                            cout<<"insufficient balance\n";
                        }
                        
                    }
                    else{
                        cout<<"Invalid Format\n";
                    }
                    break;
                    case 4:
                    cout<<"Thanks! visit again.";
                    return 0;
                    default:
                    cout<<"Invalid Entry\n";
                }
            }
        }
        else{
            cout<<"Wrong Pin\n";
            cout<<"Left chances: "<<--chances<<"\n";
            if(chances == 0){
                cout<<"\nInvalid Pin";
                return 0;}
            }
        }
}