package org.example.practice;

import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int index, n;
        System.out.println("enter the size of array");
        n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the index which do you want to delete");
        index=sc.nextInt();
        for(int i=index;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
