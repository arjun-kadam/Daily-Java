package com.jbkhackathon;

public class PrimeNum {
    public static void main(String[] args) {
        PrimeCheck1(16);

        boolean prime=isPrime(17);
        if (prime==true){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }

    public static void PrimeCheck1(int num){
        int c=2;
        boolean flag=false;
        while (c<num){
            if (num%c==0){
                flag=true;
                break;
            }
            c++;
        }
        if (!flag){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime");
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}

