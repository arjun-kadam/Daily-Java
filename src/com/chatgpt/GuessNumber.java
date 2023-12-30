package com.chatgpt;

import java.util.Random;
import java.util.Scanner;

class LogicCode {
    Scanner sc=new Scanner(System.in);
    int comp,user;
    int count=0;
    void getValues(int cInput,int uInput){
        comp=cInput;
        user=uInput;
    }
    void input(){
        System.out.print("Re-Enter ==> ");
        user=sc.nextInt();
    }

    int logic(){
        if(comp==user){
            count++;
            System.out.println("You Guessed it Correct!!!");
        }else if (user<comp){
            System.out.println("Enter Bigger Number");
            count++;
            input();
            logic();
        }else{
            System.out.println("Enter Smaller Number");
            count++;
            input();
            logic();
        }
        return count;
    }
}
public class GuessNumber{
    public static void main(String[] args) {
        Random rn=new Random();
        LogicCode obj=new LogicCode();
        Scanner sc=new Scanner(System.in);
        int cInput= rn.nextInt(1,100);
        System.out.print("Enter Your Number ==> ");
        int uInput= sc.nextInt();
        obj.getValues(cInput,uInput);
        int count=obj.logic();
        System.out.println("You Guessed in "+count+" Steps");
        System.out.print("Computer Number Was ==>"+ cInput);


    }
}