package org.example.practice;

public class FirstandLastPosition {
    static void findindex(int a[],int target){

        int start=-1;
        int n=a.length;
        for(int i=0;i<n;i++) {
            if (a[i] == target) {
                start = i;
                break;
            }
        }
        if(start==-1){
            System.out.println("element is not present");
            return;
        }
        int end=start;
        for(int i= n-1;i>= start;i--){
            if(a[i]==target){
                end=i;
                break;
            }
        }
        if(start==end) {
            System.out.println("only one key is present at index" + start);
        }

        else
            System.out.println("Starting index"+start);
        System.out.println("end index"+end);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1, 2, 7, 8, 8, 9, 8, 0, 0, 0, 8};
        findindex(arr,8);
    }
}
