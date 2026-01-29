package org.example.practice;

import java.util.Arrays;

public class DuplicateRemove {
    public static int removeduplicates(int arr[]) {
        if(arr.length==0){
                return 0;
            }
        //sort the array to bring duplicates together
        Arrays.sort(arr);

        //j is the index of last unique element found
        int j=0;
        for(int i=0;i<arr.length;i++){

            // If current element is different from the last unique element
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];   // Move the unique element to the next position
            }
        }
        return j;   // Return the unique elements
    }

    public static void main(String[] args) {
        int[]a=new int[]{1,1,1,2,2,3,4,4,5};
        int n=removeduplicates(a);
        for(int i=0;i<=n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
