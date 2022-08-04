#include <stdio.h>
#include <stdbool.h>
void main(){
    int num;
    scanf("%d",&num);
    bool prime=true;
    for(int i=2;i<num/2+1;i++){
        if(num%i==0){
            prime=false;
            break;
        }
    }
    if(prime){
        printf("prime");
    }
    else{
        printf("not prime");
    }
}