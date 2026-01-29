package org.example.forloop;

import java.util.Scanner;

public class Result {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            for (int n = 1; n <= 3; n++) {
                System.out.println("Enter marks for Student " + n );

                int total = 0;

                for (int sub = 1; sub <= 4; sub++) {
                    System.out.print("Subject " + sub);
                    int mark = sc.nextInt();
                    total = total+mark;
                }

                double average = total / 4.0;
                char grade;

                if (average >= 90) {
                    grade = 'A';
                } else if (average >= 75) {
                    grade = 'B';
                } else if (average >= 60) {
                    grade = 'C';
                } else if (average >= 50) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }

                System.out.println("Average: " + average);
                System.out.println(" Grade: " + grade);
                System.out.println(" ");
            }

        }
    }



