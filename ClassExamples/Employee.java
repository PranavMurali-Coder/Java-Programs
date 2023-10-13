/*Write a program that would print the information (name, year of joining,  address) of three employees by creating 
a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat*/
class Employee1{
    String name;
    int yearofJoining;
    int Address;

    public void setData(String name,int yearofJoining,int Address){
        this.name=name;
        this.yearofJoining=yearofJoining;
        this.Address=Address;
    }

    public void displayInfo(){
        System.out.printf("%-10s %-20s %-30s %n",name,yearofJoining,Address);
    }
}

public class Employee{

    public static void main(String[] args){
        Employee1 obj=new Employee1();
        Employee1 obj1=new Employee1();
        Employee1 obj2=new Employee1();

        obj.setData("Robert", 1994,64);
        obj1.setData("Sam", 2000, 68);
        obj2.setData("John",1999,26);

        System.out.println("Name        Year of Joining        Address");
        obj.displayInfo();
        obj1.displayInfo();
        obj2.displayInfo();

    }
}

