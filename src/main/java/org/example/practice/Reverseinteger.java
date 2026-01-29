package org.example.practice;

import java.util.Scanner;

public class Reverseinteger {
    public static void reverse(int num){
        int revnum=0;
        while(num!=0){
            revnum=revnum*10+num%10;
            num=num/10;
        }
        System.out.println(revnum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which do you want to reverse");
        int x=sc.nextInt();
        reverse(x);
    }
}
