package com.chatgpt;

public class Factorial {
    int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }else {
            return(num* factorial(num-1));

        }
    }
    public static void main(String[] args) {
        Factorial f=new Factorial();
        int ans=f.factorial(5);
        System.out.println("Factorial is:"+ ans);
    }
}
