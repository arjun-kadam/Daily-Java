package com.jbkhackathon;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(8));
        factorial2(8);
    }

    public  static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }else {
        return num*factorial(num-1);
        }
    }

    public static void factorial2(int num){
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
}
