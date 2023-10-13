package Inheri;

class ParentClass {
    public void printMessage() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    public void printMessage() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();

        ChildClass childObj = new ChildClass();

        ParentClass parentObj1 = new ChildClass();

        // Calling the method of the parent class by the object of the parent class
        parentObj.printMessage();

        // Calling the method of the child class by the object of the child class
        childObj.printMessage();

        // Calling the method of the parent class by the object of the child class
        parentObj1.printMessage();
    }
}
