package org.example.conditional;

import java.util.Scanner;

public class ShapeSide {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sides of shape");
        a=sc.nextInt();
        b=sc.nextInt();
        int c= a*b;
        System.out.println("area is: " +c);

        if(a==b){
            System.out.println("square");
        }else
            System.out.println("rectangle");
    }
}
