package org.example.practice;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr=new int[]{12,67,34,23,61};
        int n= arr.length;
        System.out.println("Reverse array is");

            for(int i=n-1;i>=0;i--){
                System.out.print(" "+arr[i]);
            }
        }
    }

