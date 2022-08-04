#include<stdio.h>
void swap(int *, int *);
void main(){
    // int a=10;
    // int *b=&a;//&address
    // // printf("%d",*b);//*value
    // //call by value call by reference
    int x=100;
    int y=90;
    swap(&x,&y);
    printf("x=%d, y=%d",x,y);

}
// void swap(int x, int y){ //pass by value call
//     int temp=x;
//     x=y;
//     y=temp;
// }
void swap(int *x, int *y){ 
    int temp;
    temp=*x;
     *x=*y;
     *y=temp;
    printf("x=%d, y=%d",*x,*y);
}