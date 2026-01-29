package org.example.forloop;

public class Fabonnci {
    public static void main(String[] args) {
        int first=0, second=1,next;

        System.out.println("Fabonnci Series is ");
        System.out.print(first+","+second+",");
        for(int i=1;i<10;i++){
            next=first+second;
            first=second;
            second=next;
            System.out.print(next+",");
        }

    }
}
