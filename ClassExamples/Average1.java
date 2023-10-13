
/*Print the average of three numbers entered by user by creating a class 
named 'Average' having a method to calculate and print the average.*/

import java.util.*;

class Average{
    double a;
    double b;
    double c;

    public Average(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public  double calcAvg(){
        double average=(a+b+c)/3;
        return average;
    }
}

class Average1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number:");
        double a=sc.nextDouble();

        System.out.println("Enter 2nd number:");
        double b=sc.nextDouble();

        System.out.println("Enter 3rd number:");
        double c=sc.nextDouble();

        Average obj=new Average(a, b, c);
        System.out.println("The average of the 3 numbers is "+obj.calcAvg());

        sc.close();
    }
}