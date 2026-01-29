package org.example.forloop;

public class FractionSum {
    public static void main(String[] args) {
        int n=10;
        double sum=0.0;

        for(int i=1;i<=10;i++){
            sum= sum+(double) i/(i+1);

        }
        System.out.println("sum of fraction number 1/2+2/3+3/4...........10 is: " +sum);
    }
}
