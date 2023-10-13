/*Write a program to print the area of two rectangles having 
sides (4,5) and (5,8) respectively by creating a class 
named 'Rectangle' with a method named 'Area' which returns 
the area and perimeter when length and breadth passed as parameters to its constructor.*/

class Rectangle1{
    double length;
    double breadth;

    public Rectangle1(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double getArea(){
        double area=length*breadth;
        return area;
    }

    public double getPerimeter(){
        double perimeter=2*(length+breadth);
        return perimeter;
    }
}

class Rectangle{
    public static void main(String[] args){
        Rectangle1 obj=new Rectangle1(4,5);
        Rectangle1 obj1=new Rectangle1(5,8);

        System.out.println("Area: "+obj.getArea()+" ,Perimeter: "+obj.getPerimeter());
        System.out.println("Area: "+obj1.getArea()+" ,Perimeter: "+obj1.getPerimeter());
        
    }
}