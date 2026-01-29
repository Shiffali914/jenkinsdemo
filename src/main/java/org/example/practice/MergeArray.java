package org.example.practice;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int al=sc.nextInt();
        System.out.println("enter the size of second array");
        int bl=sc.nextInt();

        int a[]=new int[al];
        int b[]=new int[bl];
        int cl=al+bl;
        int c[]=new int[cl];

        System.out.println("enter the first array");
        for(int i=0;i<al;i++){
           a[i]=sc.nextInt();
        }
        System.out.println("enter the second array");
        for(int i=0;i<bl;i++){
            b[i]=sc.nextInt();
        }
        int count=0;

        for(int i=0;i<al;i++)
            c[count++]=a[i];
        for(int i=0;i<bl;i++)
            c[count++]=b[i];
        System.out.println("merge arrays is");
        for(int i=0;i<count;i++){
            System.out.print(c[i]+" ");
        }
    }
}
