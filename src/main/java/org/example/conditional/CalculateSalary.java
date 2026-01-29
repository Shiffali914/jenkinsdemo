package org.example.conditional;

import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {

        int salary,hra,da;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the monthly salary of employee");
        salary= sc.nextInt();
        if(salary> 35000){
//             totalsalary= salary*12/100*13/100;
//             total=totalsalary+salary;

                hra=salary* 12/100;
                da=salary*13/100;
            System.out.println(hra);
            System.out.println(da);

//            System.out.println("Total salary is: "+total);

        }
        else {
//            totalsalary=salary*8/100*14/100;
//            total=totalsalary+salary;
//            System.out.println("Total salary is:" +total);

            hra= salary*8/100;
            da=salary*14/100;
            System.out.println(hra);
            System.out.println(da);
        }

    }
}
