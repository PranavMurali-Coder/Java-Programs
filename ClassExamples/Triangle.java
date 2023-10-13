/*Write a program to print the area and perimeter of a triangle having sides of 
3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.*/



class Triangle{

    double a;
    double b;
    double c;

    public void setValues(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getArea(){
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public double getPerimeter(){
        double perimeter=a+b+c;
        return perimeter;
    }

    public static void main(String[] args){
        Triangle tri=new Triangle();
        tri.setValues(3,4,5);

        double area=tri.getArea();
        double perimeter=tri.getPerimeter();
        
        System.out.println("The area of the triangle is "+area);
        System.out.println("The perimeter of the triangle is "+perimeter);
    }
}