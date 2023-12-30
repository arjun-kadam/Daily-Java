package com.chatgpt;

import java.util.Scanner;

public class InterestCalci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principle,year; float rate;
        System.out.print("Enter Your Principle Amount ==>");
        principle=sc.nextInt();
        System.out.print("Enter Interest Rate ==>");
        rate=sc.nextFloat();
        System.out.print("Enter Years==>");
        year=sc.nextInt();
        float final_amt=(principle*rate*year)/100;
        System.out.println("Your Final Amount is==> "+(principle+(int)final_amt));
    }
}
