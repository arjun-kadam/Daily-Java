package com.chatgpt;

import java.util.Scanner;

public class Calculator {
    Scanner sc=new Scanner(System.in);
    void operations(){
        int num1; int num2;
        System.out.print("Enter 1st Number: ");
        num1=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2=sc.nextInt();
        int choice;
        System.out.println("Choose Operation: \t 1.Add \t 2.Sub \t 3.Mul \t 4.Div");
        choice=sc.nextInt();
        if (choice==1){
            add(num1,num2);
        }else if (choice==2){
            sub(num1,num2);
        }else if (choice==3){
            mul(num1,num2);
        }else if (choice==4){
            div(num1,num2);
        }else {
            System.out.println("Enter Valid Choice");
        }

    }
    void add(int num1, int num2){
        System.out.println("Addition is : "+(num1+num2));
    }
    void sub(int num1, int num2){
        System.out.println("Subtraction is : "+ (num1-num2));
    }
    void mul(int num1, int num2){
        System.out.println("Multiplication is : "+ (num1*num2));
    }
    void div(int num1, int num2){
        System.out.println("Division is : "+ (num1/num2));
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.operations();
    }
}
