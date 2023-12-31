package com.chatgpt;

public class FibSeries {
    public static void main(String[] args) {
        int num1=0; int num2=1;
        int end=8;
        int nextNum=0;
        for (int i=3;i<=end;i++){
            nextNum=num1+num2;
            num1=num2;
            num2=nextNum;
        }
        System.out.println(nextNum);
    }
}
