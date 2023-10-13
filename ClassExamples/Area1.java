
/*Write a program to print the area of a rectangle by creating a 
class named 'Area' having two methods. 
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 
'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/



import java.util.*;

class Area{
    double length;
    double breadth;

    public void setDim(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double getArea(){
        return length*breadth;
    }
}

 public class Area1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        double length=sc.nextDouble();

        System.out.println("Enter the breadth of rectangle");
        double breadth=sc.nextDouble();

        Area rectangle=new Area();

        rectangle.setDim(length,breadth);

        double area=rectangle.getArea();
        System.out.println("The area of the rectangle is "+area);

        sc.close();
    }
}