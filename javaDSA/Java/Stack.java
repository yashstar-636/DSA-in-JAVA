package JavaWithDsa;

import java.util.Scanner;


public class Stack {
    int n=6, top =-1;
     int stack[]=new int[n];
     int push(int val){
         if (isFull()) {
             return -1;
         }
         else{
             top++;
             stack[top]=val;
             return 1;
         }
     }
     int pop (){
         if (isEmpty()){
             return -1;
         }
         else{
             int v=stack[top];
             top--;
             return v;
         }
     }
     int peek(){
         return stack[top];
     }
     boolean isFull(){
         return top==n-1;
     }

     boolean isEmpty(){
         return top==-1;
     }

    public static void main(String[] args) {
         System.out.println("enter the number of which you have to create the stack");
    Stack obj = new Stack();
        System.out.println(obj.push(16));
        System.out.println(obj.push(17));
        System.out.println(obj.push(15));
        System.out.println(obj.push(58));
        System.out.println(obj.push(5));
        System.out.println(obj.push(56));
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.push(56));
        System.out.println(obj.push(58));
        System.out.println(obj.push(5));
        System.out.println(obj.push(56));
        System.out.println(obj.push(56));

     }
}
