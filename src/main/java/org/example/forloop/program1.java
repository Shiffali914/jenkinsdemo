package org.example.forloop;

public class program1 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=9;i=i+1){
            if(i%2==0){
                System.out.print(i+"+");
            }
            else {
                System.out.print(i + "-");
            }
        }
        System.out.print(i);
    }
}
