package org.example.forloop;

import java.util.Scanner;

public class SumTenNumber {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        System.out.println("Sum of n number is:");
        for(int i=0; i<=n; i++){
            sum=sum+i;

        }
        System.out.print(sum);
    }
}
